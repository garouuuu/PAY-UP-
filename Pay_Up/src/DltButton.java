import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DltButton extends JButton
{
    public DltButton(ImageIcon icon)
    {
    	
        // Create a button with a bin icon and the specified name
        super(icon);
        this.setBounds(300, 450, 40, 40);	
        
    }
}
