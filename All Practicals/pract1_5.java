import java.awt.*;
public class pract1_5 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 1_4");
		f1.setSize(300, 300);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Button b1 = new Button("OK");
		Button b2 = new Button("RESET");
		Button b3 = new Button("CANCEL");
		
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
	}
}
