import java.awt.*;
public class pract1 {
	public static void main(String[] args) {
		//Creating frame using Flow Layout
		Frame f1 = new Frame("Program 1");
		f1.setSize(400, 400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		//Creating components for the frame
		Label l1 = new Label("Enter Your Full Name:");
		TextField t1 = new TextField("Humayun Khan");
		Button b1 = new Button("Enter");
		
		//Adding components on the frame
		f1.add(l1);
		f1.add(t1);
		f1.add(b1);
	}
}