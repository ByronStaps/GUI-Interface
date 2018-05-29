import java.awt.*;
import javax.swing.*;



//Extends the JFrame to get the Window Browser box, Scroll bar, X, without writing the Code, built in Frame. 
public class JFramePractice extends JFrame {

	//Created a JLable vairable 
	private JLabel item1; 

	//Created a Constructor with no arguments. 
	public JFramePractice() {

		//Super is the Title Bar
		super("The title Bar");
		
		//
		setLayout(new FlowLayout());


		item1 = new JLabel("This is a sentence ");
		
		
		
		item1.setToolTipText("This will show up when you hoover over it");
		
		
		
		add(item1);


	}




}
