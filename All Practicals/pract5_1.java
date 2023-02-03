import java.awt.*;
import java.awt.event.*;
class MenuEx extends Frame{
	MenuEx(){
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		Menu m1 = new Menu("Colors");
		MenuItem mn1 = new MenuItem("Red");
		MenuItem mn2 = new MenuItem("Yellow");
		MenuItem mn3 = new MenuItem("Black");
		mn3.setEnabled(false);
		MenuItem mn4 = new MenuItem("Blue");
		MenuItem mn5 = new MenuItem("Green");
		m1.add(mn1);
		m1.add(mn2);
		m1.add(mn3);
		m1.add(mn4);
		m1.add(mn5);
		mb.add(m1);
	}
}
class pract5_1{
	public static void main(String Args[]) {
		MenuEx m = new MenuEx();
		m.setTitle("Practical 5_1");
		m.setSize(300, 300);
		m.setVisible(true);
		m.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}