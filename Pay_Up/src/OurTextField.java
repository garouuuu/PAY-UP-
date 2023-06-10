import javax.swing.JTextField;

public class OurTextField extends JTextField {
    public OurTextField(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        setHorizontalAlignment(JTextField.CENTER);
    }
}
