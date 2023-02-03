import java.awt.*;
import java.awt.event.*;
public class pract2_1 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 2_1");
		f1.setSize(300,200);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		List l = new List(10);
		l.add("Mumbai");
		l.add("Amravati");
		l.add("Aurangabad");
		l.add("Chandrapur");
		l.add("Jalgaon");
		l.add("Khandala");
		l.add("Kolhapur");
		l.add("Nashik");
		l.add("Solapur");
		l.add("Thane");
		
		f1.add(l);
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}