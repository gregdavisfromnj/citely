/**
 *  Copyright 2012 Gregory J. Davis
 *
 *  This file is part of CitelyDesktop.
 *  CitelyDesktop is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CitelyDesktop is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CitelyDesktop.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.citely.CitelyDesktop.model;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.citely.citelyCommon.Citation;

/**
 * This is a mock implementation of a querymodel datamodel.  It is hard-coded
 * to some good books or references for UI dev purposes.
 */
public class MockQueryModel implements IQueryModel {

	@Override
	public List<Citation> getViewedRecords() {
		List<Citation> viewedRecords = new ArrayList<Citation>();
		
		Citation temp = Citation.Factory.newInstance();
		temp.setTitle("The Life and Adventures of Nicholas Nickleby");
		temp.setAuthor("Charles Dickens");
		temp.setYear("1838");
		viewedRecords.add(temp);
		
		return viewedRecords;
	}

	@Override
	public void setViewedRecords(List<Citation> viewedRecords) {
		// Doesn't really matter what we do with this list, since we hard code
		// the result to the clients of this interface/class
		return;
	}

}
