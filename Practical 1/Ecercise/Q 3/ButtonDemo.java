import java.awt.*;
public class ButtonDemo{
	public static void main(String args[]){
		Frame f1 = new Frame("Buttons");
		f1.setSize(400,400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Button b1 = new Button("OK");
		f1.add(b1);
		Button b2 = new Button("Reset");
		f1.add(b2);
		Button b3 = new Button("Cancel");
		f1.add(b3);
	}
}