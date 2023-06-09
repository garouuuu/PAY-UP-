import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class PopupMessage extends Dialog {
    private static final long serialVersionUID = 1L;

    public PopupMessage(Frame parent, String message) {
        super(parent, true);
        setLayout(null);
        setSize(310, 180);
        setLocationRelativeTo(parent);
        setBackground(new Color(153, 255, 153));
        setResizable(false);
        
        
     // Set the icon image of our logo
        BufferedImage iconImage = null;
        try {
            iconImage = ImageIO.read(getClass().getResourceAsStream("/icon.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setIconImage(iconImage);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(300, 200);
        panel.setBackground(new Color(153, 255, 153));
        add(panel);

        JLabel label = new JLabel(message);
        label.setFont(new Font("Verdana", Font.PLAIN, 12));
        label.setBounds(10, 40, 400, 80);
        panel.add(label);

        JButton closeButton = new JButton("Οκ");
        closeButton.setBounds(110, 110, 80, 30);
        closeButton.setBackground(new Color(0, 128, 255));
        panel.add(closeButton);
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}
