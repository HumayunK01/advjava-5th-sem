import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class pract7_2{
	public static void main(String[] Args){
		JFrame jf = new JFrame("Practical 7_2");

		DefaultMutableTreeNode parent = new DefaultMutableTreeNode("This PC");
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("Local Disk C");
		DefaultMutableTreeNode d = new DefaultMutableTreeNode("Local Disk D");
		DefaultMutableTreeNode e = new DefaultMutableTreeNode("Local Disk E");
		
		DefaultMutableTreeNode cp = new DefaultMutableTreeNode("Program Files");
		DefaultMutableTreeNode cj = new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode ca = new DefaultMutableTreeNode("Admin");

		DefaultMutableTreeNode dv = new DefaultMutableTreeNode("Videos");
		DefaultMutableTreeNode dp = new DefaultMutableTreeNode("Photos");
		DefaultMutableTreeNode ds = new DefaultMutableTreeNode("ScreenShots");
		
		DefaultMutableTreeNode em = new DefaultMutableTreeNode("Movies");
		DefaultMutableTreeNode es = new DefaultMutableTreeNode("Series");
		DefaultMutableTreeNode ed = new DefaultMutableTreeNode("Documents");
		
		parent.add(c);
		parent.add(d);
		parent.add(e);
		
		c.add(cp);
		c.add(cj);
		c.add(ca);

		d.add(dv);
		d.add(dp);
		d.add(ds);

		e.add(em);
		e.add(es);
		e.add(ed);

		JTree tree = new JTree(parent);
		jf.add(tree);
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}