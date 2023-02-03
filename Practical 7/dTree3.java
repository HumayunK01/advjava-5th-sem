import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
public class dTree3 {
	public static void main(String[] args) {
		JFrame jj = new JFrame();
		
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
		jj.add(tree);
		jj.setSize(400, 500);
		jj.setVisible(true);
		jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}