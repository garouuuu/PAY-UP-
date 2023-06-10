// import statement  
import java.awt.*;    
import javax.swing.*;    
    
public class Pay3rdChooseBill 
{    
JFrame frameObj;  
  
// constructor    
Pay3rdChooseBill ()  
{    
    // creating a frame object  
    frameObj = new JFrame("Πληρωμή Λογαριασμού Τρίτου");    
    
    JLabel label = new JLabel("Πληρωμή Λογαριασμού Τρίτου");    
    frameObj.add(label); // creating the buttons 
    label.setBounds(50,20,250,20);
    label.setFont(new Font("Carbil",Font.PLAIN, 15));
    frameObj.setLayout(null);
    
    JButton b1 = new JButton("Ρεύμα");
    b1.setBounds(10,80,80,40);  
    frameObj.add(b1); 
    frameObj.setLayout(null); 
    
    JButton b2 = new JButton("Νερό");
    b2.setBounds(110,80,95,40);
    frameObj.add(b2);   
    frameObj.setLayout(null); 
    
    JButton b3 = new JButton("Τηλέφωνο"); 
    b3.setBounds(220,80,100,40);
    frameObj.add(b3);
    frameObj.setLayout(null); 
    

    
 
      
    JButton b11 = new JButton("Πίσω"); 
    b11.setBounds(10,380,80,20);
    frameObj.add(b11);
    frameObj.setLayout(null); 
    
    frameObj.setSize(350, 500);    
    frameObj.setVisible(true);    
}    



}  