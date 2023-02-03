import java.awt.*;
import java.awt.event.*;
class MenuDemo extends Frame{
	MenuDemo(){
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		MenuShortcut ms = new MenuShortcut(KeyEvent.VK_X);
		Menu m1 = new Menu("File");
		MenuItem mn1 = new MenuItem("New...");
		MenuItem mn2 = new MenuItem("Open...");
		MenuItem mn3 = new MenuItem("Save As...");
		MenuItem mn4 = new MenuItem("Exit",ms);
		m1.add(mn1);
		m1.add(mn2);
		m1.add(mn3);
		m1.addSeparator();
		m1.add(mn4);
		mb.add(m1);
	}
}
public class pract5_2 {
	public static void main(String[] args) {
		MenuDemo m = new MenuDemo();
		m.setSize(300, 300);
		m.setVisible(true);
		m.setTitle("Practical 5_2");
		m.setLayout(null);
		m.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}