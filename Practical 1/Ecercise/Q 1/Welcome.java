import java.awt.*;
public class Welcome{
	public static void main(String args[]){
		Frame f1 = new Frame("Welcome");
		f1.setSize(600,400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Label l1 = new Label("Welcome to Java");
		f1.add(l1);
	}
}
