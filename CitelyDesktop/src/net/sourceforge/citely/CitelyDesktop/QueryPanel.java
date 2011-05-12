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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

/**
 * 
 */
public class QueryPanel extends Composite {

	public QueryPanel(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout();
		this.setLayout(gridLayout);
		
		Table viewedRecords = new Table(this,  SWT.VIRTUAL | SWT.BORDER);
		GridData data = new GridData(GridData.FILL, GridData.FILL, true, true);
	    viewedRecords.setLayoutData(data);
	    
		// TODO remove this stuff and put in logic to read the current query-selection-model
		viewedRecords.setHeaderVisible(true);
		viewedRecords.setLinesVisible(true);
				
		viewedRecords.setRedraw(false);
		
	    TableColumn[] column = new TableColumn[3];
	    column[0] = new TableColumn(viewedRecords, SWT.NONE);
	    column[0].setText("Author");
	    
	    column[1] = new TableColumn(viewedRecords, SWT.NONE);
	    column[1].setText("Title");
	    
	    column[2] = new TableColumn(viewedRecords, SWT.NONE);
	    column[2].setText("Date");
	    
	    TableItem item1 = new TableItem(viewedRecords, SWT.NONE);
	    item1.setText(0, "Charles Dickens");
	    item1.setText(1, "The Life and Adventures of Nicholas Nickleby");
	    item1.setText(2, "1838");
	    
	    viewedRecords.setRedraw(true);
	    	    
	    for (int i = 0; i < column.length; i++) {
	      column[i].pack();
	    }
	    
	   
		this.pack();
	}

}
