import java.awt.*;
import java.awt.event.*;
public class GridLayout_5_5 {
	public static void main(String args[]){
		Frame f = new Frame();
		f.setSize(500,500);
		f.setLayout(new GridLayout(5,5));
		f.setVisible(true);

		Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
		b1 = new Button("One");
		b2 = new Button("Two");
		b3 = new Button("Three");
		b4 = new Button("Four");
		b5 = new Button("Five");
		b6 = new Button("Six");
		b7 = new Button("Seven");
		b8 = new Button("Eight");
		b9 = new Button("Nine");
		b10 = new Button("Ten");
		b11= new Button("Eleven");
		b12 = new Button("Twelve");
		b13 = new Button("Thirteen");
		b14 = new Button("Fourteen");
		b15 = new Button("Fifteen");
		b16 = new Button("Sixteen");
		b17 = new Button("Seventeen");
		b18 = new Button("Eighteen");
		b19 = new Button("Nineteen");
		b20 = new Button("Twenty");
		b21 = new Button("Twenty One");
		b22 = new Button("Twenty Two");
		b23 = new Button("Twenty Three");
		b24 = new Button("Twenty Four");
		b25 = new Button("Twenty Five");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(b16);
		f.add(b17);
		f.add(b18);
		f.add(b19);
		f.add(b20);
		f.add(b21);
		f.add(b22);
		f.add(b23);
		f.add(b24);
		f.add(b25);

		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
}