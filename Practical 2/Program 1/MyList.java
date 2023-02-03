import java.awt.*;
import java.awt.event.*;
public class MyList extends Frame{
MyList() {
	setLayout(new FlowLayout());
	setSize(400,400);
	setTitle("My List Program");
	setVisible(true);
	
	List myList = new List(3,true);
	myList.add("Summer");
	myList.add("Rainy");
	myList.add("Winter");
	add(myList);

	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
}

public static void main(String Args[]){
	MyList ml = new MyList();
}
}