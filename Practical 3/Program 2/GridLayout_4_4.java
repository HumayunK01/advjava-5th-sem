import java.awt.*;
import java.awt.event.*;
public class GridLayout_4_4 {
	public static void main(String args[]){
		Frame f = new Frame();
		f.setSize(500,500);
		f.setLayout(new GridLayout(4,4));
		f.setVisible(true);

		Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
		b0 = new Button("Zero");
		b1 = new Button("One");
		b2 = new Button("Two");
		b3 = new Button("Three");
		b4 = new Button("Four");
		b5 = new Button("Five");
		b6 = new Button("Six");
		b7 = new Button("Seven");
		b8 = new Button("Eight");
		b9 = new Button("Nine");

		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}