import java.awt.Font;
import javax.swing.JLabel;

public class OurLabel extends JLabel 
{
    public OurLabel(String text, int x, int y, int width, int height, Font font) {
        super(text);
        setBounds(x, y, width, height);
        setFont(font);
    }
}
