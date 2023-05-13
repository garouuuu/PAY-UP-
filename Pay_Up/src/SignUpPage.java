import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUpPage 
{
	static OurFrame frame;
	static OurLabel windowLabel;	
	static OurLabel fNameLabel;
	static OurLabel lNameLabel;
	static OurLabel emailLabel;
	static OurLabel passwordLabel;
	static OurLabel confirmPasLabel;
	static OurTextField fNameText;
	static OurTextField lNameText;
	static OurTextField emailText;
	static OurTextField passwordText ;
	static OurTextField confirmPasText ;	
	static OurButton nextButton  ;
	static OurButton backButton ;

	
	
	public SignUpPage()
	{
        
		frame = new OurFrame("Sign Up", 500, 100, 400, 700); // Create an instance of OurFrame 
		windowLabel = new OurLabel("Enter your credentials",73,5,300,100,new Font("Verdana", Font.BOLD, 20));
		fNameLabel = new OurLabel("First Name",20, 100, 130, 40,new Font("Verdana", Font.BOLD, 14));		
		lNameLabel = new OurLabel("Last Name",200, 100, 130, 40,new Font("Verdana", Font.BOLD, 14));
		emailLabel = new OurLabel("Email",20, 200, 130, 40,new Font("Verdana", Font.BOLD, 14));
		passwordLabel = new OurLabel("Password",20, 300, 130, 40,new Font("Verdana", Font.BOLD, 14));
		confirmPasLabel  = new OurLabel("Confirm Password",20, 400, 160, 40,new Font("Verdana", Font.BOLD, 14));
		
		fNameText = new OurTextField(20, 130, 160, 30);
		lNameText = new OurTextField(200, 130, 170, 30);
		emailText = new OurTextField(20, 230, 350, 30);
		passwordText = new OurTextField(20, 330, 350, 30);
		confirmPasText = new OurTextField(20, 430, 350, 30);
		
		nextButton = new OurButton("Next",280, 530, 90, 40,new Color(0, 204, 102));
		backButton = new OurButton("Back",20, 530, 90, 40,new Color(0, 128, 255));
    	
		
		
		frame.add(windowLabel);
		frame.add(fNameLabel);
    	frame.add(lNameLabel);
    	frame.add(emailLabel);
    	frame.add(passwordLabel);
    	frame.add(confirmPasLabel);	
    	frame.add(fNameText);
    	frame.add(lNameText);
    	frame.add(emailText);
    	frame.add(passwordText);
    	frame.add(confirmPasText);
      	frame.add(nextButton);
    	frame.add(backButton);
    	
		
        
        frame.setVisible(true); // Exhibit the frame 
	
	}
		
}
