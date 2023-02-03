import java.awt.*;
import java.awt.event.*;
public class pract3_2 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 3_2");
		f1.setSize(300,200);
		f1.setVisible(true);
		f1.setLayout(new GridLayout(3,2,15,15));
		
		Button b1,b2,b3,b4,b5;
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}