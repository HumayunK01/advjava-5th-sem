import java.awt.*;
import java.awt.event.*;
class MenuDemo1{
	MenuDemo1(){
	Frame f = new Frame("MenuBar Demo");
	MenuBar mb = new MenuBar();
	MenuShortcut ms = new MenuShortcut(KeyEvent.VK_X);
	Menu Menu = new Menu("File");
	MenuItem i1 = new MenuItem("New...");
	MenuItem i2 = new MenuItem("Open...");
	MenuItem i3 = new MenuItem("Save as...");
	MenuItem i4 = new MenuItem("Exit",ms);
	
	Menu.add(i1);
	Menu.add(i2);
	Menu.add(i3);
	Menu.addSeparator();
	Menu.add(i4);
	
	mb.add(Menu);
	f.setMenuBar(mb);
	f.setLayout(null);
	f.setSize(400, 400);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
	public static void main(String args[]) {
		new MenuDemo1();
	}
}