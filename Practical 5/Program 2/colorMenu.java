import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class MenuEx extends Frame
{
MenuEx()
{
MenuBar mr=new MenuBar();
setMenuBar(mr);
Menu m1=new Menu("Colours");
MenuItem mn1=new MenuItem("Red");
MenuItem mn2=new MenuItem("Yellow");
MenuItem mn3=new MenuItem("Black");
mn3.setEnabled(false);
MenuItem mn4=new MenuItem("Blue");
MenuItem mn5=new MenuItem("Green");
m1.add(mn1);
m1.add(mn2);
m1.add(mn3);
m1.add(mn4);
m1.add(mn5);
mr.add(m1);
}
}
class colorMenu
{
public static void main(String args[])
{
MenuEx m=new MenuEx();
m.setTitle("Menu Bar");
m.setSize(500,500);
m.setVisible(true);
m.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
});
}
}