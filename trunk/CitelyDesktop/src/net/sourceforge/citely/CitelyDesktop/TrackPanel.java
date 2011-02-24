/**
 *  Copyright 2011 Gregory J. Davis
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
package net.sourceforge.citely.CitelyDesktop;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * This panel is a track of breadcrumbs.  It is a search history, but should probably
 * do some more fun things like point the trend towards where the user really wants to
 * search.  In other words, "based on what you've been searching for, you should look at
 * this."
 */
public class TrackPanel extends org.eclipse.swt.widgets.Composite {

	/**
	 * Set this out in a vertical orientation. 
	 * @param parent the containing composite
	 * @param style not important
	 */
	public TrackPanel(Composite parent, int style) {
		super(parent, style);
		FillLayout fillLayout = new FillLayout(SWT.VERTICAL);
		this.setLayout(fillLayout);
		
		String[] queries = {"first", "second", "third", "fourth"};
		int numQueries = queries.length;
		
		Label[] labels = new Label[numQueries];
		for (int i = 0; i < numQueries; ++i) {
			labels[i] = new Label(this, SWT.NONE);
			labels[i].setText(queries[i]);
		}
		
		this.pack();
	}

}