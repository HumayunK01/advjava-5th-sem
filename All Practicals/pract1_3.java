import java.awt.*;
public class pract1_3 {

	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 1_3");
		f1.setSize(400, 200);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Label l1 = new Label("Welcome to Java");
		f1.add(l1);
	}

}
