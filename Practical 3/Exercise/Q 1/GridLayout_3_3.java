import java.awt.*;
import java.awt.event.*;
public class GridLayout_3_3 {
	public static void main(String args[]){
		Frame f = new Frame();
		f.setTitle("Grid Layout Demo");
		f.setSize(300,200);
		f.setLayout(new GridLayout(3,2,15,15));
		f.setVisible(true);

		Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
		b1 = new Button("Button 1");
		b2 = new Button("Button 2");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}