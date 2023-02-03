import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
public class MouseDemo extends Applet implements MouseMotionListener {
	public void init () {
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent e) {
		setBackground(Color.yellow);
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		setBackground(Color.green);
		repaint();
	}
}
/* <APPLET CODE ="MouseDemoBg" WIDTH=300 HEIGHT=500> </APPLET> */
