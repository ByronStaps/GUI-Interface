import javax.swing.*;

public class JOptionPanePractice {

	public static void main(String[] args) {
		
		
		//Created an Object, and Called the method within the Class
		GUIClassPractice g1 = new GUIClassPractice();
		g1.sum();
		
		//Created an new Object from the JFramePractice Class, 
		JFramePractice jf1 = new JFramePractice();
		
		//The setDafaultClose.. allows for the X in the window browser the Red X to close program.
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Set the actual size of the window Browser. 
		jf1.setSize(275,180);
		//SetVisible True to show the Window Browser, and False to not display the Window Browser. 
		jf1.setVisible(false);
		

	}

}
