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

import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;

/**
 * 
 */
public class CitelyDesktop {

	/**
	 * This is the main class which starts up a main shell window.
	 * @param args
	 */
	public static void main(String[] args) {
		// setup the main window
		Display display = new Display ();
		Shell shell = new Shell(display);
		
		// setup the window's icon
		Class<CitelyDesktop> desktopClass = CitelyDesktop.class;
		ClassLoader desktopClassLoader = desktopClass.getClassLoader();
		InputStream imgStream =  desktopClassLoader.getResourceAsStream("images/C.png");
		if (imgStream != null) {
			Image img = new Image(display, imgStream);
			shell.setImage(img);
		}

		// setup other window properties
		shell.setText("Citely");
		
		// go go go!
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	
	}
	
	

}
