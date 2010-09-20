/**
 *  Copyright 2010 Gregory J. Davis
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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 */
public class NavPanel extends org.eclipse.swt.widgets.Composite {

	public NavPanel(Composite parent, int style) {
		super(parent, SWT.NONE);
		FillLayout fillLayout = new FillLayout(SWT.VERTICAL);
		this.setLayout(fillLayout);
		
		Button SearchCitations = new Button(this, SWT.PUSH);
		SearchCitations.setText("Search");
		SearchCitations.setSize(60, 20);
		
		Button CreateCitation = new Button(this, SWT.PUSH);
		CreateCitation.setText("New Citation");
		CreateCitation.setSize(60, 20);
		
		Button DeleteSelection = new Button(this, SWT.PUSH);
		DeleteSelection.setText("Delete Selection");
		DeleteSelection.setSize(60, 20);
		
		Button EditSelection = new Button(this, SWT.PUSH);
		EditSelection.setText("Edit Selection");
		EditSelection.setSize(60, 20);
		
		Button ShowDetails = new Button(this, SWT.PUSH);
		ShowDetails.setText("Show Details");
		ShowDetails.setSize(60, 20);
		
		this.pack();
	}

	

} 
