/**
 *  Copyright 2010 Gregory J. Davis
 *
 *  This file is part of CitelyCommon.
 *  CitelyCommon is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CitelyCommon is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CitelyCommon.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.citely.citelyCommon;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 */
public class SqlBackend implements Backend {

	Connection db = null;

	static String[] citationFields = { "Address", "Annote", "Author",
			"Booktitle", "Chapter", "Crossref", "Edition", "Editor", "Eprint",
			"Howpublished", "Institution", "Journal", "Key", "Month", "Note",
			"Number", "Organization", "Pages", "Publisher", "School", "Series",
			"Title", "Type", "Url", "Volume", "Year", "PublicationType",
			"EntryKey" };

	/**
	 * This should not be used to construct a SqlBackend object there should
	 * always be a connection present
	 */
	@SuppressWarnings("unused")
	private SqlBackend() {
	}

	public SqlBackend(String connectionString) throws SQLException {
		db = DriverManager.getConnection(connectionString);
		// hope all is well with the connection string...
	}

	/**
	 * Creates a citation record in this backend database. This will ensure that
	 * the citation values are validated. For the SQL backend, this is crucial
	 * for preventing SQL injection security vulnerabilities. The validation is
	 * actually accomplished by the Java SQL library through the use of a
	 * prepared statement for creating the record.
	 * 
	 * @return
	 * 
	 * @see net.sourceforge.citely.citelyCommon.Backend#createCitation(net.sourceforge.citely.citelyCommon.Citation)
	 */
	@Override
	public boolean createCitation(Citation citation) {
		// set up the prepared statement for an insert... do all 28 fields in
		// the citation
		PreparedStatement createStatement = null;
		try {
			createStatement = db
					.prepareStatement("INSERT INTO citations "
							+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
							+ " VALUES "
							+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		} catch (SQLException e) {
			// bad connection on the db variable?
			e.printStackTrace();
			return false;
		}

		// check to see if the statement was actually created, bail if not
		if (createStatement == null) {
			// something bad happened, let's go home
			return false;
		}

		// now that we are rolling, populate the statement with field names and
		// values
		try {
			for (int i = 0; i < 28; i++) {
				// field name
				createStatement.setString(i + 1, // parameter list is 1-based
						citationFields[i]);

				// field value
				Method getter = Citation.class.getMethod("get"
						+ citationFields[i], String.class);
				createStatement.setString(i + 28, // still 1 based, but in the
													// next group of 28
						(String) getter.invoke(citation));
			}
		} catch (SQLException e) {
			// no clue why this would have happened
			e.printStackTrace();
			return false;
		} catch (NoSuchMethodException e) {
			// hmmm, but it should exist...
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			// bunch of other stuff
			e.printStackTrace();
			return false;
		}

		// without further ado, insert that record!
		try {
			createStatement.executeUpdate();
		} catch (SQLException e) {
			// server didn't like that request, it seems
			e.printStackTrace();
			return false;
		}

		return true; // successfully created the record
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sourceforge.citely.citelyCommon.Backend#readCitation(java.lang.String
	 * )
	 */
	@Override
	public Citation readCitation(String entryKey) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sourceforge.citely.citelyCommon.Backend#updateCitation(net.sourceforge
	 * .citely.citelyCommon.Citation)
	 */
	@Override
	public boolean updateCitation(Citation citation) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sourceforge.citely.citelyCommon.Backend#deleteCitation(java.lang.
	 * String)
	 */
	@Override
	public boolean deleteCitation(String entryKey) {
		return false;
	}

}
