import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.*;

public class LogInPage extends JFrame {
    
	 
	
    public LogInPage() 
    {
      
     
    	JFrame frame = new JFrame(); //JFrame Creation       
    	frame.setTitle("Log In"); //Add the title to frame
    	frame.setLayout(null); //Terminates default flow layout
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminate program on close button
    	frame.setBounds(100, 100, 400, 700); //Sets the position of the frame
    	Color customColor = new Color(153, 255, 153); // for the background color
    	frame.getContentPane().setBackground(customColor);
    
    
    	//for the icon image of our logo
    	BufferedImage iconImage = null;
        try {
            iconImage = ImageIO.read(getClass().getResourceAsStream("/icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        frame.setIconImage(iconImage);
    
        
        
        // Create the label at the top of the window
        JLabel label = new JLabel("Ready to PayUp?");
        label.setBounds(110,15,200,100);
        label.setFont(new Font("Verdana", Font.BOLD, 20));
        frame.add(label); //adding the label to the frame 
        
        
        // Load the image for inside the window from the src folder
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        java.net.URL imageUrl = classLoader.getResource("icon.png");
        ImageIcon imageLogo = new ImageIcon(imageUrl);
        
            
        // Create the image label below the top label
        JLabel imageLabel = new JLabel(imageLogo);
        imageLabel.setBounds(100, 80, 190, 190);
        frame.add(imageLabel);	//adding it to the frame
        
        
      
        // Create the text fields and labels for username
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(65, 350, 90, 40);
        userLabel.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField userText = new JTextField();
        userText.setBounds(85, 390, 220, 30);  
        frame.add(userLabel);
        frame.add(userText);
        
        
     // Create the text fields and labels for password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(65, 420, 90, 40);
        passwordLabel.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField passwordText = new JTextField();
        passwordText.setBounds(85, 460, 220, 30);  
        frame.add(passwordLabel);
        frame.add(passwordText);
        
        
           
        // Create the login and signup buttons
        JButton loginButton = new JButton("Log in");
        loginButton.setBounds(140, 520, 80, 30);
        loginButton.setBackground(new Color(0, 128, 255));
        frame.add(loginButton);
        JButton signupButton = new JButton("Sign up");
        signupButton.setBounds(140, 570, 80, 30);
        signupButton.setBackground(new Color(0, 204, 102));
        frame.add(signupButton);
      
       //Create the about us button
        JButton aboutusButton = new JButton("About us?");
        aboutusButton.setBounds(270, 610, 105, 30);
        aboutusButton.setBackground(new Color(255, 255, 102));
        frame.add(aboutusButton);
        
   
        frame.setVisible(true); // Exhibit the frame  
    
    }

    
}
