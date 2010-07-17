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
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

/**
 * 
 */
public class CitelyDesktop {

	static Display display = null;
	static Shell shell = null;
	
	/**
	 * This is the main class which starts up a main shell window.
	 * @param args
	 */
	public static void main(String[] args) {
		// setup the main window
		display = new Display ();
		shell = new Shell(display);
		shell.setText("Citely");

		// setup the window's icon
		Class<CitelyDesktop> desktopClass = CitelyDesktop.class;
		ClassLoader desktopClassLoader = desktopClass.getClassLoader();
		InputStream imgStream =  desktopClassLoader.getResourceAsStream("images/C.png");
		if (imgStream != null) {
			Image img = new Image(display, imgStream);
			shell.setImage(img);
		}

		// setup other window properties
		Rectangle displayRect = Display.getCurrent().getClientArea();
		shell.setSize((int)(displayRect.width *  0.61803),
				(int)(displayRect.height * 0.61803));
		
		// add a menubar
		Menu mainMenu = new Menu(shell, SWT.BAR);
	    Menu fileMenu = new Menu(shell, SWT.DROP_DOWN);
	    Menu editMenu = new Menu(shell, SWT.DROP_DOWN);
	    Menu helpMenu = new Menu(shell, SWT.DROP_DOWN);
		
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
			
	    shell.setMenuBar(mainMenu);
	    
	    // add a dummy text area
	    Text textArea = new Text(shell, SWT.CENTER | SWT.WRAP | SWT.MULTI);
	    textArea.setBounds(shell.getClientArea());
	    
	    // go go go!
		shell.pack();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) {
				display.sleep ();
			}
		}
		display.dispose ();
	
	}
}


