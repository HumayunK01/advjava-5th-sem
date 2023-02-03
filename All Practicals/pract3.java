import java.awt.*;
import java.awt.event.*;
public class pract3 {
	public static void main(String[] args) {
		Frame f1= new Frame("Practical 3");
		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.setLayout(new GridLayout(5, 5));
		
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
		b11 = new Button("Eleven");
		b12 = new Button("Twelve");
		b13 = new Button("Thirteen");
		b14 = new Button("Fourteen");
		b15 = new Button("Fifteen");
		b16 = new Button("Sixteen");
		b17 = new Button("Seventeen");
		b18 = new Button("Eighteen");
		b19 = new Button("Nineteen");
		b20 = new Button("Twenty");
		b21 = new Button("Twenty-One");
		b22 = new Button("Twenty-Two");
		b23 = new Button("Twenty-Three");
		b24 = new Button("Twenty-Four");
		b25 = new Button("Twenty-Five");
		
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(b7);
		f1.add(b8);
		f1.add(b9);
		f1.add(b10);
		f1.add(b11);
		f1.add(b12);
		f1.add(b13);
		f1.add(b14);
		f1.add(b15);
		f1.add(b16);
		f1.add(b17);
		f1.add(b18);
		f1.add(b19);
		f1.add(b20);
		f1.add(b21);
		f1.add(b22);
		f1.add(b23);
		f1.add(b24);
		f1.add(b25);
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}