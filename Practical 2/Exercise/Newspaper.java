import java.awt.*;
import java.awt.event.*;
public class Newspaper extends Frame{
Newspaper() {
	setLayout(new FlowLayout());
	setSize(400,400);
	setTitle("Newspaper Program");
	setVisible(true);
	
	List myList = new List(6,true);
	myList.add("Amar Ujala");
	myList.add("Greater Kashmir");
	myList.add("Dainik Jagran");
	myList.add("Dainik Navajyoti");
	myList.add("Hari Bhoomi");
	myList.add("Jansatta");
	add(myList);

	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
}

public static void main(String Args[]){
	Newspaper ml = new Newspaper();
}
}