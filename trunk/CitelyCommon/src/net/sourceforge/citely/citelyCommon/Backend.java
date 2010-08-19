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

/**
 * This is the interface for data access backends. This should abstract away the
 * exact database or storage implementation from the view.
 */
public interface Backend {

	/**
	 * Adds a citation to the backend.
	 * 
	 * @param citation
	 *            new and hopefully complete citation to add
	 * @return true, if successfully added, false if not
	 */
	public boolean createCitation(Citation citation);

	/**
	 * Reads or fetches a citation by key from the backend. If nothing was
	 * found, this will return a null object.
	 * 
	 * @param entryKey
	 *            the key for the citation to read back
	 * @return the citation that was read back matching the key
	 */
	public Citation readCitation(String entryKey);

	/**
	 * Modifies or edits the citation. The backend will find the citation with
	 * the matching key and update its fields accordingly.
	 * 
	 * @param citation
	 *            new version of the citation in question
	 * @return true if successfully modified, false if not
	 */
	public boolean updateCitation(Citation citation);

	/**
	 * Finds the citation specified by a key and deletes it.
	 * 
	 * @param entryKey
	 *            key of the citation to delete
	 * @return true if successfully deleted, false if not
	 */
	public boolean deleteCitation(String entryKey);

}
