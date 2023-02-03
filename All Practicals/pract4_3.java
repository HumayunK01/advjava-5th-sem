import java.awt.*;
import javax.swing.*;
public class pract4_3 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Practical 4_3");
		f.setSize(400,270);
		f.setVisible(true);
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(gb);
		
		gbc.fill = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		Label l1 = new Label("Name");
		f.add(l1,gbc);
		
		gbc.fill = GridBagConstraints.WEST;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.ipadx = 50;
		TextField tf = new TextField();
		f.add(tf,gbc);
		
		gbc.fill = GridBagConstraints.EAST;
		gbc.gridx = 0;
		gbc.gridy = 2;
		Label l2 = new Label("Comments");
		f.add(l2,gbc);
		
		gbc.fill = GridBagConstraints.WEST;
		gbc.gridx = 1;
		gbc.gridy = 2;
		TextArea ta = new TextArea(7,6);
		f.add(ta,gbc);
		
		gbc.fill = GridBagConstraints.EAST;
		gbc.gridx = 1;
		gbc.gridy = 3;
		Button b1 = new Button("Submit");
		f.add(b1,gbc);
	}
}