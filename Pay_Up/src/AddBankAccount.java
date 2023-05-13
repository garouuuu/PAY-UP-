import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class AddBankAccount 
{
	static OurFrame frame; 
	static OurLabel windowLabel;
	static AdvancedTextField ibanText;	
	static AdvancedTextField cardNumText;
	static AdvancedTextField fAndLNameText;
	static AdvancedTextField passwordText ;
	static AdvancedTextField expDateText ;
	static AdvancedTextField CVVText ;
	static OurButton nextButton  ;
	static OurButton backButton ;
	
	
	public AddBankAccount()
	{
		
		frame = new OurFrame("Add Bank Account", 900, 100, 400, 700);
		windowLabel = new OurLabel("Enter your bank account credentials",28,5,500,100,new Font("Verdana", Font.BOLD, 17));
		ibanText = new AdvancedTextField("IBAN",28, 140, 330, 50,new Font("Verdana", Font.PLAIN, 14));
		cardNumText = new AdvancedTextField("Card number",28, 240, 330, 50,new Font("Verdana", Font.PLAIN, 14));		
		fAndLNameText = new AdvancedTextField("First and last name",28, 340, 330, 50,new Font("Verdana", Font.PLAIN, 14));		
		expDateText = new AdvancedTextField("Exp Date",28, 440, 150, 50,new Font("Verdana", Font.PLAIN, 14));		
		CVVText = new AdvancedTextField("CVV",210, 440, 150, 50,new Font("Verdana", Font.PLAIN, 14));
		nextButton = new OurButton("Submit",280, 530, 90, 40,new Color(0, 204, 102));
		backButton = new OurButton("Back",20, 530, 90, 40,new Color(0, 128, 255));
	
		frame.add(windowLabel);
		frame.add(ibanText);
    	frame.add(cardNumText);
    	frame.add(fAndLNameText);
    	frame.add(expDateText);
    	frame.add(CVVText);
    	frame.add(nextButton);
    	frame.add(backButton);
		
		

        
		

		frame.setVisible(true); // Exhibit the frame 
		
	}

}
