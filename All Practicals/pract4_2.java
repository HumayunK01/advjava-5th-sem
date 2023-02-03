import java.awt.*;
import java.awt.event.*;
public class pract4_2 {
	public static void main(String[] args) {
		Frame f = new Frame("Practical 4_2");
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setLayout(gb);
		f.setSize(300,200);
		f.setVisible(true);
		
		gbc.fill  = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		Button b1 = new Button("Button One");
		f.add(b1,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		Button b2 = new Button("Button Two");
		f.add(b2,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.ipady = 20;
		Button b3 = new Button("Button Three");
		f.add(b3,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.ipady = 20;
		Button b4 = new Button("Button Four");
		f.add(b4,gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		Button b5 = new Button("Button Five");
		f.add(b5,gbc);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
}