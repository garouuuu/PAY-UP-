import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class OurFrame extends JFrame
{
	
	
	public OurFrame(String title, int x, int y, int width, int height)
	{
		
		super(title); // call JFrame constructor with the given title
        setBounds(x, y, width, height); // set the frame position and size
        getContentPane().setBackground(new Color(153, 255, 153)); // set the background color
        
        // Set the icon image of our logo
        BufferedImage iconImage = null;
        try {
            iconImage = ImageIO.read(getClass().getResourceAsStream("/icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setIconImage(iconImage);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminate program on close button
        setLayout(null); // Terminate default flow layout
        
	}

}
