import java.awt.*;    
import javax.swing.*;    
    
public class Pay3rdPhone
{    
JFrame frameObj;  
  
// constructor    
Pay3rdPhone()  
{    
    // creating a frame object  
    frameObj = new JFrame("Πληρωμή Λογαριασμού Ρευματός");    
    
    JLabel label = new JLabel("");    
    frameObj.add(label); // creating the buttons 
    label.setBounds(95,20,250,20);
    label.setFont(new Font("Carbil",Font.PLAIN, 15));
    frameObj.setLayout(null);
    

   
    
    JLabel label2 = new JLabel("Αριθμός Πλήρωμής");    
    frameObj.add(label2); 
    label2.setBounds(100,100,150,20);
    frameObj.setLayout(null);
    
    JTextField t2;  
    t2=new JTextField();  
    t2.setBounds(80,120, 150,30);
     frameObj.add(t2); 
    frameObj.setVisible(true);  
    frameObj.setLayout(null);
    
     JLabel label4 = new JLabel("Κάρτα");    
    frameObj.add(label4); 
    label4.setBounds(135,210,60,20);
    frameObj.setLayout(null);
 
        String cards[]={};//θα συνδέονταν με την dropDown για βρει τις κάρτες απο την βάση         
        
        JComboBox cb=new JComboBox(cards);    
       cb.setBounds(80, 230,150,20);    
       frameObj.add(cb);        
        frameObj.setLayout(null);
        
        JLabel label3 = new JLabel("Ποσό");    
    frameObj.add(label3); 
    label3.setBounds(135,260,60,20);
    frameObj.setLayout(null);
    
        JTextField t3;  
    t3=new JTextField();  
    t3.setBounds(120,280, 60,30);
     frameObj.add(t3); 
    frameObj.setVisible(true);  
    frameObj.setLayout(null);
  
    JButton b10 = new JButton("Πληρωμή"); 
    b10.setBounds(105,320,90,20);
    frameObj.add(b10);
    frameObj.setLayout(null); 
      
    JButton b11 = new JButton("Πίσω"); 
    b11.setBounds(10,380,80,20);
    frameObj.add(b11);
    frameObj.setLayout(null); 
    
    
    frameObj.setSize(350, 500);    
    frameObj.setVisible(true);    
}    


}  