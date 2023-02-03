import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class pract7_1{
	public static void main(String[] Args){
		JFrame jf = new JFrame();
		
		DefaultMutableTreeNode parent = new DefaultMutableTreeNode("India");
		DefaultMutableTreeNode m = new DefaultMutableTreeNode("Maharashtra");
		DefaultMutableTreeNode mi = new DefaultMutableTreeNode("Mumbai");
		DefaultMutableTreeNode p = new DefaultMutableTreeNode("Pune");
		DefaultMutableTreeNode n = new DefaultMutableTreeNode("Nashik");
		DefaultMutableTreeNode nag = new DefaultMutableTreeNode("Nagpur");
		DefaultMutableTreeNode guj = new DefaultMutableTreeNode("Gujrat");
		
		parent.add(m);
		parent.add(guj);
		
		m.add(mi);
		m.add(p);
		m.add(n);
		m.add(nag);

		JTree tree = new JTree(parent);
		jf.add(tree);
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}