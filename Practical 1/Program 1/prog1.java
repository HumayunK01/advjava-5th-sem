import java.awt.*;
public class prog1{
	public static void main(String args[]){

		Frame f1 = new Frame("Program 1");                                 
		f1.setSize(600,400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());

		Label l1 = new Label("Enter Your Full Name"); 
		f1.add(l1);

		TextField tf = new TextField("Humayun Khan");                             
		f1.add(tf);

		Button b1 = new Button("OK");                                      
		f1.add(b1);
                                                     
		TextArea ta = new TextArea();                                     
		f1.add(ta);                                                       
	}
}