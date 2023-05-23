import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.*;

public class LogInPage  {
    
	static OurFrame frame;
	static OurLabel windowLabel;
	static OurLabel userLabel;
	static OurLabel passwordLabel;
	static OurTextField userText;
	static OurTextField passwordText;
	static OurButton loginButton ;
	static OurButton signupButton;
	static OurButton aboutusButton;
	
    public LogInPage() 
    {
    	frame = new OurFrame("Log In", 100, 100, 400, 700); // Create an instance of OurFrame 
    	windowLabel = new OurLabel("Ready to PayUp?",110,15,200,100,new Font("Verdana", Font.BOLD, 20));
    	userLabel = new OurLabel("Username:",65, 350, 90, 40,new Font("Verdana", Font.BOLD, 14));
    	passwordLabel = new OurLabel("Password:",65, 420, 90, 40,new Font("Verdana", Font.BOLD, 14));
    	userText = new OurTextField(85, 390, 220, 30);
    	passwordText = new OurTextField(85, 460, 220, 30);
    	loginButton = new OurButton("Σύνδεση",140, 520, 100, 30,new Color(0, 128, 255));
    	signupButton = new OurButton("Εγγραφή",140, 570, 100, 30,new Color(0, 204, 102));
    	aboutusButton = new OurButton("About us?",270, 610, 105, 30,new Color(255, 255, 102));
    	
    	frame.add(windowLabel);
    	frame.add(userLabel);
    	frame.add(passwordLabel);
    	frame.add(userText);
    	frame.add(passwordText);
    	frame.add(loginButton);
    	frame.add(signupButton);
    	frame.add(aboutusButton);
    	
    	
        // Load the image for inside the window from the src folder
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        java.net.URL imageUrl = classLoader.getResource("icon.png");
        ImageIcon imageLogo = new ImageIcon(imageUrl);
        
            
        // Create the image label below the top label
        JLabel imageLabel = new JLabel(imageLogo);
        imageLabel.setBounds(100, 80, 190, 190);
        frame.add(imageLabel);	//adding it to the frame
        
   
        frame.setVisible(true); // Exhibit the frame  
    
    }

    
}
