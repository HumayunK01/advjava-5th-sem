import java.awt.*;
public class pract1_4 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 1_4");
		f1.setSize(400, 400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Label l1 = new Label("Select Languages You Know:");
		Checkbox cb1 = new Checkbox("Marathi");
		Checkbox cb2 = new Checkbox("Hindi");
		Checkbox cb3 = new Checkbox("English");
		Checkbox cb4 = new Checkbox("Sanskrit");
		
		f1.add(l1);
		f1.add(cb1);
		f1.add(cb2);
		f1.add(cb3);
		f1.add(cb4);
	}
}