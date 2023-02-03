import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class pract6_1 extends JApplet implements ItemListener{
	JLabel JLabelObj;
	
	public void init() {
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		JComboBox JComboBoxObj = new JComboBox();
		
		JComboBoxObj.addItem("Solapur");
		JComboBoxObj.addItem("Pune");
		JComboBoxObj.addItem("Bangalore");
		JComboBoxObj.addItem("Mumbai");
		JComboBoxObj.addItemListener(this);
		
		JLabelObj = new JLabel();
		
		add(JComboBoxObj);
		add(JLabelObj);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		String stateName = (String) ie.getItem();
		JLabelObj.setText("You're in " + stateName);
	}
}