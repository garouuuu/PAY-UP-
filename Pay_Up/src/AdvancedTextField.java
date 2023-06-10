import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public class AdvancedTextField extends JTextField {
    public AdvancedTextField(String text,int x, int y, int width, int height,Font font) {
    	super(text);
        setBounds(x, y, width, height);
        setHorizontalAlignment(JTextField.CENTER);
        setFont(font);
           
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (getText().equals(text)) {
                    setText("");
                }
            }
        });        
        
        addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (getText().isEmpty()) {
                    setText(text);
                    setForeground(Color.GRAY);
                }
            }
        });
         
    }
    
   
    
    
}
