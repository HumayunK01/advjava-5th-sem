import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class KeyEventDemo extends Applet implements KeyListener {
String msg = "" ;
public void init ()
{
	addKeyListener(this);
}
public void keyReleased(KeyEvent k) {
	showStatus("Key Released");
   	repaint();
}
public void Typed(KeyEvent k) {
//	showStatus("Key Released");
//   	repaint();
}
public void keyPressed(KeyEvent k) {
	showStatus("Key Pressed");
   	repaint();
}
}