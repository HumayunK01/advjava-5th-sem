import java.awt.*;
import java.awt.event.*;
public class MenuExample {
	MenuExample(){
		Frame f = new Frame("MenuBar");
		MenuBar mb = new MenuBar();
		MenuShortcut ms;
		f.setMenuBar(mb);
		ms = new MenuShortcut(KeyEvent.VK_CANCEL);
		
		Menu m1 = new Menu("File");
		Menu m2 = new Menu("Edit");
		
		Menu submenu = new Menu("More....",true);
		
		MenuItem i1 = new MenuItem("New");
		MenuItem i2 = new MenuItem("Open");
		MenuItem i3 = new MenuItem("Save");
		MenuItem i4 = new MenuItem("Exit",ms);
		MenuItem i5 = new MenuItem("Cut");
		MenuItem i6 = new MenuItem("Copy");
		MenuItem i7 = new MenuItem("Paste");
		MenuItem i8 = new MenuItem("Spelling");
		MenuItem i9 = new MenuItem("Grammer");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.addSeparator();
		m1.add(i4);
		m2.add(i5);
		m2.add(i6);
		m2.add(i7);
		
		m1.add(submenu);
		submenu.add(i8);
		submenu.add(i9);
		
		mb.add(m1);
		mb.add(m2);
		ms = new MenuShortcut(KeyEvent.VK_X);
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public static void main(String Args[]) {
		new MenuExample();
	}

}