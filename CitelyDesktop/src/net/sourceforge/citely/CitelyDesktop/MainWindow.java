package net.sourceforge.citely.CitelyDesktop;

import java.io.InputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class MainWindow {

	Display display = null;
	Shell shell = null;

	public void show() {

		// setup the main window
		display = new Display();
		shell = new Shell(display);
		shell.setText("Citely");

		// setup the window's icon
		Class<CitelyDesktop> desktopClass = CitelyDesktop.class;
		ClassLoader desktopClassLoader = desktopClass.getClassLoader();
		InputStream imgStream = desktopClassLoader
				.getResourceAsStream("images/C.png");
		if (imgStream != null) {
			Image img = new Image(display, imgStream);
			shell.setImage(img);
		}

		// setup other window properties
		Rectangle displayRect = Display.getCurrent().getClientArea();
		shell.setSize((int) (displayRect.width * 0.61803),
				(int) (displayRect.height * 0.61803));

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
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
