import java.awt.*;
import java.awt.event.*;
public class Cities extends Frame{
Cities() {
	setLayout(new FlowLayout());
	setSize(400,400);
	setTitle("10 Cities Program");
	setVisible(true);
	
	List myList = new List(10,true);
	myList.add("Mumbai");
	myList.add("Pune");
	myList.add("Nagpur");
	myList.add("Thane");
	myList.add("Nashik");
	myList.add("Aurangabaad");
	myList.add("Solapur");
	myList.add("Jalgaon");
	myList.add("Amravati");
	myList.add("Ulhasnagar");
	add(myList);

	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}
	});
}

public static void main(String Args[]){
	Cities ml = new Cities();
}
}