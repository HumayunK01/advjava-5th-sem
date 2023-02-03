import java.awt.*;
import java.awt.event.*;
public class BorderDemo {
	public static void main(String args[]){
		Frame f = new Frame();
		f.setTitle("Border Demo");
		f.setSize(300,300);
		f.setVisible(true);

		Button b1,b2,b3,b4,b5;
		b1 = new Button("North");
		b2 = new Button("West");
		b3 = new Button("Center");
		b4 = new Button("East");
		b5 = new Button("South");

		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.WEST);
		f.add(b3,BorderLayout.CENTER);
		f.add(b4,BorderLayout.EAST);
		f.add(b5,BorderLayout.SOUTH);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}