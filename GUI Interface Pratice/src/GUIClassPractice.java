import javax.swing.JOptionPane;
import java.awt.*;


public class GUIClassPractice {
	
	
	
	public void sum() {
		//Created to String to hold the Input from Dialog box
		String firstNum = JOptionPane.showInputDialog("Enter the First Number");
		String secondNum = JOptionPane.showInputDialog("Enter the Second Number");
		
		//The Input from the Input returns a String variable, which you can't add to String convert the string into Integer using the Parse method. 
		int num1 =Integer.parseInt(firstNum);
		int num2 =Integer.parseInt(secondNum);
		
		//Created a Variable to hold the sum of num1 & num2
		int sum = num1+num2;
		
		//Created Show Message Dialog which takes four arguments		
		//1. THe area of the page you would like the message box to appear
		//2. A String to Display the actual message
		//3. A Title for the Message Dialog Box 
		//4.
		JOptionPane.showMessageDialog(null, "The anwser is " + sum, "The title is", JOptionPane.PLAIN_MESSAGE);
		
		
		
	}

}
