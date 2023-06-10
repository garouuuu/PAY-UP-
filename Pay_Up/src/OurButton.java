import java.awt.Color;
import javax.swing.JButton;

public class OurButton extends JButton {
    public OurButton(String text, int x, int y, int width, int height, Color color) {
        super(text);
        setBounds(x, y, width, height);
        setBackground(color);
        
        
        ButtonHandler buttonHandler = new ButtonHandler();
        addActionListener(buttonHandler);
        
    }
}