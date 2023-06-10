import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.*;  
//import java.awt.event.*;  
public class IndexPage 
{  
	static OurFrame frame;
	static OurLabel windowLabel;
	static JPanel panel;
	static JPanel p1;
	static JPanel p2;
	static JPanel p3;
	static JTextArea ta;
	static JTabbedPane tp;
	static OurButton b;
	static OurButton b1;
	static OurButton b2;
	static OurButton b3;
	static OurButton b4;
//	static OurButton b5;
	

	public IndexPage() 
    {  
    	frame = new OurFrame("Kεντρικό Μενού", 500, 100, 400, 600);
    	windowLabel = new OurLabel("Καλώς ήλθατε!",45,3,300,100,new Font("Verdana", Font.BOLD, 28));
    	b = new OurButton("Λογαριασμός Τρίτου",80,500,215,30,new Color(102, 178, 255));
        b1 = new OurButton("+",300,290,45,40,new Color(0, 128, 255));	//για ρευμα
        b2 = new OurButton("+",300,340,45,40,new Color(0, 128, 255));	//για νερο
        b3 = new OurButton("+",300,390,45,40,new Color(0, 128, 255));	//για τηλεφωνο
        b4 = new OurButton("+",300,440,45,40,new Color(0, 128, 255));	//για δοση
   //     b5 = new OurButton("Μενού",300,20,80,30,new Color(255, 255, 102));
        
    	panel = new JPanel();  
    	panel.setLayout(new FlowLayout()); 
        
    	ta=new JTextArea(300,300);  
    	p1=new JPanel();  
    	p1.add(ta);  
    	p2=new JPanel();  
    	p3=new JPanel();  
    	
    	tp=new JTabbedPane();  
    	tp.setBounds(40,90,300,150);  
    	tp.add("Card 1",p1);  
    	tp.add("Card 2",p2);  
    	tp.add("Card 3",p3);    
        

        String numbersElec[]={"Ρεύμα","2222222","3333333","44444444","555555555"}; 
        String numbersWat[]={"Νερό","2222222","3333333","44444444","555555555"};
        String numbersPho[]={"Τηλέφωνο","2222222","3333333","44444444","555555555"};
        String numbersInsta[]={"Πληρωμή Δόσης","2222222","3333333","44444444","555555555"};
        
        JComboBox<?> cb=new JComboBox<Object>(numbersElec);    
        cb.setBounds(40,290,250,40);    

        JComboBox<?> cb1=new JComboBox<Object>(numbersWat);    
        cb1.setBounds(40,340,250,40);    
    
        JComboBox<?> cb2=new JComboBox<Object>(numbersPho);    
        cb2.setBounds(40,390,250,40);    
      
        JComboBox<?> cb3=new JComboBox<Object>(numbersInsta);    
        cb3.setBounds(40,440,250,40);    
   
 
        String menu_opt[]={"Μενού","Προσθήκη/Διαγραφή Λογαριασμού Τραπέζης","Επεξεργασία Προσωπικών Στοιχείων","FQAs","Log Out"};
        JComboBox cb4=new JComboBox(menu_opt);    
        cb4.setBounds(60, 20,270,20);    
        frame.add(cb4);        
        frame.setLayout(null);
        
        
        
        
        frame.add(tp);
        frame.add(cb);
        frame.add(cb1); 
        frame.add(cb2);
        frame.add(cb3);
        frame.add(b);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
  //      frame.add(b5);
        frame.add(windowLabel);
        
        
        frame.setVisible(true);  
        
        /*frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(b1);
        b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				frame.dispose();
				new AddElectricBill();
			}
		});
     */  
    } 
   
}
