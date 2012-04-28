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

import java.util.List;

import net.sourceforge.citely.citelyCommon.Citation;

/**
 * This is the base datamodel for the CitelyDesktop application.
 * This datamodel is maintained by a server, but cached locally by the desktop
 * client.  In this way, the QueryModel becomes a cache of what is on the server.
 * This allows the desktop client to interact with a local entity which buffers
 * changes taking place on or originating from a CitelyServer.  Additionally, the
 * QueryModel takes on the responsibility of notifying individual controls on the
 * Desktop client of changes.  And so, a change or modification in one control will
 * have loosely coupled effect on another control.  Such a situation may arise
 * when generting the chronological list of items in a breadcrumb-navigation control.
 */
public interface IQueryModel {
	
	public List<Citation> getViewedRecords();
	
	public void setViewedRecords(List<Citation> viewedRecords);
	
	

}