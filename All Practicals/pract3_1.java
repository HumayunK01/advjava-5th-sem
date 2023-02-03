import java.awt.*;
import java.awt.event.*;
public class pract3_1 {
	public static void main(String[] args) {
		Frame f = new Frame("Practical 3_1");
		f.setSize(700,300);
		f.setVisible(true);
		f.setLayout(new GridLayout(0,9));

		Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}