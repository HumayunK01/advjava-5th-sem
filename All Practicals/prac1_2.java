import java.awt.*;
import java.util.*;
public class prac1_2 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 1_2");
		f1.setSize(400, 400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Label l1 = new Label("Select Subjects:");
		Checkbox cb1 = new Checkbox("CPP");
		Checkbox cb2 = new Checkbox("AJP");
		Checkbox cb3 = new Checkbox("OSY");
		Checkbox cb4 = new Checkbox("CSS");
		
		Label l2 = new Label("Select Class");
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("CO5IA");
		Checkbox c2 = new Checkbox("CO5IB");
		
		f1.add(l1);
		f1.add(cb1);
		f1.add(cb2);
		f1.add(cb3);
		f1.add(cb4);
		f1.add(l2);
		f1.add(c1);
		f1.add(c2);
	}

}