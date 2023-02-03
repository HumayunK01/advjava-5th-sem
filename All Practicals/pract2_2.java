import java.awt.*;
import java.awt.event.*;
public class pract2_2 {
	public static void main(String[] args) {
		Frame f1 = new Frame("Practical 2_2");
		f1.setSize(300, 200);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		
		Label l = new Label("List of Newspapers");
		f1.add(l);
		
		List  l1 = new List(4,true);
		l1.add("Amar Ujala");
		l1.add("Amar Bharti");
		l1.add("Greater Kashmir");
		l1.add("Dainik Jagran");
		
		f1.add(l1);
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}