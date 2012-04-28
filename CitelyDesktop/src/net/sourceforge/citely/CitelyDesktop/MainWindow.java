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

import java.io.InputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class MainWindow {

	private Display _display = null;
	private Shell _shell = null;
	
	public MainWindow() {
		// setup the main window
		_display = new Display();
		_shell = new Shell(_display);
		_shell.setText("Citely");
	}

	public void show() {
		// setup the window's icon
		Class<CitelyDesktop> desktopClass = CitelyDesktop.class;
		ClassLoader desktopClassLoader = desktopClass.getClassLoader();
		InputStream imgStream = desktopClassLoader
				.getResourceAsStream("icons/C.png");
		if (imgStream != null) {
			Image img = new Image(_display, imgStream);
			_shell.setImage(img);
		}

		// setup other window properties
		Rectangle displayRect = Display.getCurrent().getClientArea();
		_shell.setSize((int) (displayRect.width * 0.61803),
				(int) (displayRect.height * 0.61803));

		// add a menubar, fill with the usual stuff
		Menu mainMenu = new Menu(_shell, SWT.BAR);
		Menu fileMenu = new Menu(_shell, SWT.DROP_DOWN);
		Menu editMenu = new Menu(_shell, SWT.DROP_DOWN);
		Menu helpMenu = new Menu(_shell, SWT.DROP_DOWN);

		MenuItem fileMenuHeader = new MenuItem(mainMenu, SWT.CASCADE);
		fileMenuHeader.setText("&File");
		fileMenuHeader.setMenu(fileMenu);

		MenuItem fileNewMenuItem = new MenuItem(fileMenu, SWT.PUSH);
		fileNewMenuItem.setText("&New");

		MenuItem fileExitItem = new MenuItem(fileMenu, SWT.PUSH);
		fileExitItem.setText("E&xit");

		MenuItem editMenuHeader = new MenuItem(mainMenu, SWT.CASCADE);
		editMenuHeader.setText("&Edit");
		editMenuHeader.setMenu(editMenu);

		MenuItem editDeleteItem = new MenuItem(editMenu, SWT.PUSH);
		editDeleteItem.setText("&Delete");

		MenuItem editCutItem = new MenuItem(editMenu, SWT.PUSH);
		editCutItem.setText("Cu&t");

		MenuItem editCopyItem = new MenuItem(editMenu, SWT.PUSH);
		editCopyItem.setText("&Copy");

		MenuItem editPasteItem = new MenuItem(editMenu, SWT.PUSH);
		editPasteItem.setText("&Paste");

		MenuItem helpMenuHeader = new MenuItem(mainMenu, SWT.CASCADE);
		helpMenuHeader.setText("&Help");
		helpMenuHeader.setMenu(helpMenu);

		MenuItem helpAboutItem = new MenuItem(helpMenu, SWT.PUSH);
		helpAboutItem.setText("&About");

		_shell.setMenuBar(mainMenu);

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 4;
		_shell.setLayout(gridLayout);

		// add a navbar/control-surface, user initiates major actions here 
		ControlPanel controlPanel = new ControlPanel(_shell, SWT.NONE);
		GridData controlPanelData = new GridData(GridData.FILL, GridData.BEGINNING, false, false);
		controlPanel.setLayoutData(controlPanelData);
		
		
		// whatever the user does, is reflected here
		QueryPanel queryPanel = new QueryPanel(_shell, SWT.FILL);
		GridData queryPanelData = new GridData(GridData.FILL, GridData.FILL, true, true);
		queryPanel.setLayoutData(queryPanelData);
		
		// this is a logical description of what the user is viewing in queryPanel
		TrackPanel trackPanel = new TrackPanel(_shell, SWT.NONE);
		GridData trackPanelData = new GridData(GridData.FILL, GridData.BEGINNING, false, false);
		trackPanel.setLayoutData(trackPanelData);
		
		// go go go!
		_shell.pack();
		_shell.open();
		while (!_shell.isDisposed()) {
			if (!_display.readAndDispatch()) {
				_display.sleep();
			}
		}
		_display.dispose();
	}
}