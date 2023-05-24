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
	static OurLabel usernameLabel;
	static OurLabel emailLabel;
	static OurLabel passwordLabel;
	static OurLabel confirmPasLabel;
	static OurTextField fNameText;
	static OurTextField lNameText;
	static OurTextField emailText;
	static OurTextField passwordText ;
	static OurTextField confirmPasText ;	
	static OurTextField usernameText;
	static OurButton nextButton  ;
	static OurButton backButton ;

	
	
	public SignUpPage()
	{
        
		frame = new OurFrame("Sign Up", 500, 100, 400, 700); // Create an instance of OurFrame 
		windowLabel = new OurLabel("Συμπλήρωσε τα στοιχεία σου",40,5,350,100,new Font("Verdana", Font.BOLD, 20));
		fNameLabel = new OurLabel("Όνομα",20, 100, 130, 40,new Font("Verdana", Font.BOLD, 14));		
		lNameLabel = new OurLabel("Επίθετο",200, 100, 130, 40,new Font("Verdana", Font.BOLD, 14));
		
		usernameLabel = new OurLabel("Όνομα Χρήστη",20, 180, 130, 40,new Font("Verdana", Font.BOLD, 14));
		
		emailLabel = new OurLabel("Email",20, 260, 160, 40,new Font("Verdana", Font.BOLD, 14));
		passwordLabel = new OurLabel("Κωδικός",20, 360, 130, 40,new Font("Verdana", Font.BOLD, 14));
		confirmPasLabel  = new OurLabel("Επιβεβαίωση Κωδικού",20, 460, 200, 40,new Font("Verdana", Font.BOLD, 14));
		
		fNameText = new OurTextField(20, 130, 160, 30);
		lNameText = new OurTextField(200, 130, 170, 30);
		
		usernameText = new OurTextField(20, 210, 350, 30);
		
		emailText = new OurTextField(20, 290, 350, 30);
		passwordText = new OurTextField(20, 390, 350, 30);
		confirmPasText = new OurTextField(20, 490, 350, 30);
		
		nextButton = new OurButton("Επόμενο",280, 560, 90, 40,new Color(0, 204, 102));
		backButton = new OurButton("Πίσω",20, 560, 90, 40,new Color(0, 128, 255));
    	
		
		
		frame.add(windowLabel);
		frame.add(fNameLabel);
    	frame.add(lNameLabel);
    	frame.add(usernameLabel);
    	frame.add(usernameText);
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
