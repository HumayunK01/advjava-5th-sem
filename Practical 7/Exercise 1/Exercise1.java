import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
public class Exercise1 {
	public static void main(String[] args) {
		JFrame jj = new JFrame();
		
		DefaultMutableTreeNode parent = new DefaultMutableTreeNode("This PC");
		DefaultMutableTreeNode d = new DefaultMutableTreeNode("Desktop");
		DefaultMutableTreeNode r = new DefaultMutableTreeNode("Recycle Bin");
		DefaultMutableTreeNode down = new DefaultMutableTreeNode("Downloads");
		DefaultMutableTreeNode p = new DefaultMutableTreeNode("Pictures");
		DefaultMutableTreeNode l = new DefaultMutableTreeNode("Local Disk C");
		DefaultMutableTreeNode prog = new DefaultMutableTreeNode("Program Files");
		DefaultMutableTreeNode e = new DefaultMutableTreeNode("New Volume E");
		DefaultMutableTreeNode pho = new DefaultMutableTreeNode("My Photos");
		DefaultMutableTreeNode f = new DefaultMutableTreeNode("New Volume F");
		DefaultMutableTreeNode vid = new DefaultMutableTreeNode("Videos");
		DefaultMutableTreeNode cd = new DefaultMutableTreeNode("CD Drive");
		
		parent.add(d);
		parent.add(down);
		parent.add(l);
		parent.add(e);
		parent.add(f);
		parent.add(cd);
		
		
		d.add(r);
		down.add(p);
		l.add(prog);
		e.add(pho);
		f.add(vid);
		
		JTree tree = new JTree(parent);
		jj.add(tree);
		jj.setSize(400, 500);
		jj.setVisible(true);
		jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}