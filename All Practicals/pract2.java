import java.awt.*;
import java.awt.event.*;
public class pract2 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 2");
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		List l = new List();
		l.add("Summer");
		l.add("Winter");
		l.add("Rainy");
		f1.add(l);
		
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}