import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
 
public class MouseDemoCount extends Applet implements MouseListener {
	Label l;
	public void init () {
		setLayout(null);
		l=new Label("Hello Mouse");
		l.setBounds(50,150,200,100);
		add(l);
		l.addMouseListener(this);
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("mouse clicked(# of clicks:"+e.getClickCount());
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
/* <APPLET CODE ="MouseDemoCount" WIDTH=300 HEIGHT=500> </APPLET> */
