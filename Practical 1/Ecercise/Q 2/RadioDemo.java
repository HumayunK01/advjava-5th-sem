import java.awt.*;
import java.util.*;

public class RadioDemo{
	public static void main(String args[]){
		Frame f = new Frame();
		f.setVisible(true);
		f.setSize(600,400);
		f.setLayout(new FlowLayout());

		Label l1 = new Label("Select Subjects:");
		
		Checkbox cb1 = new Checkbox("Marathi");
		Checkbox cb2 = new Checkbox("Hindi");
		Checkbox cb3 = new Checkbox("English");
		Checkbox cb4 = new Checkbox("Sanskrit");


		f.add(l1);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
	}
}