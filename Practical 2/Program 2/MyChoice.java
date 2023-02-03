import java.awt.*;
import java.awt.event.*;
public class MyChoice extends Frame{
	MyChoice(){
		setLayout(new FlowLayout());
		setSize(400,400);
		setTitle("My Choice Program");
		setVisible(true);
		Label l1 = new Label("Select any subject you like");
		add(l1);
		Choice ch = new Choice();
		ch.add("AJP");
		ch.add("OSY");
		ch.add("STE");
		ch.add("CSS");
		ch.add("EST");
		add(ch);

		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
	}
	
	public static void main(String args[]){
		MyChoice m = new MyChoice();
	}
}