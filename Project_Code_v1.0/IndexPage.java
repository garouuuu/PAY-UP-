import java.awt.Color;
import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.*;  
//import java.awt.event.*;  
public class IndexPage 
{  
	static OurFrame frame;
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
	static OurButton b5;
	

	public IndexPage() 
    {  
    	frame = new OurFrame("Kεντρικό Μενού", 500, 100, 400, 700);
       
    	panel = new JPanel();  
    	panel.setLayout(new FlowLayout()); 
        
    	ta=new JTextArea(200,200);  
    	p1=new JPanel();  
    	p1.add(ta);  
    	p2=new JPanel();  
    	p3=new JPanel();  
    	
    	tp=new JTabbedPane();  
    	tp.setBounds(50,50,215,100);  
    	tp.add("Card 1",p1);  
    	tp.add("Card 2",p2);  
    	tp.add("Card 3",p3);    
        

        String prov_numbers[]={"11111111","2222222","3333333","44444444","555555555"};// κανονικα θα επρεπε να εμφανιζονται απο την μεθοδο dropDown       
        
        JComboBox<?> cb=new JComboBox<Object>(prov_numbers);    
        cb.setBounds(50,170,120,20);    

        JComboBox<?> cb1=new JComboBox<Object>(prov_numbers);    
        cb1.setBounds(50,200,120,20);    
    
        JComboBox<?> cb2=new JComboBox<Object>(prov_numbers);    
        cb2.setBounds(50,230,120,20);    
      
        JComboBox<?> cb3=new JComboBox<Object>(prov_numbers);    
       cb3.setBounds(50,260,120,20);    
        
       b = new OurButton("Πληρωμή Λογαριασμού Τρίτου",50,300,215,30,new Color(0, 204, 102));
       b1 = new OurButton("+",190,170,45,20,new Color(0, 204, 102));
       b2 = new OurButton("+",190,200,45,20,new Color(0, 204, 102));
       b3 = new OurButton("+",190,230,45,20,new Color(0, 204, 102));
       b4 = new OurButton("+",190,260,45,20,new Color(0, 204, 102));
       b5 = new OurButton("Μενού",250,20,75,20,new Color(0, 204, 102));

   
      
        frame.add(tp);
        frame.add(cb);
        frame.add(cb1); 
        frame.add(cb2);
        frame.add(cb3);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        
        
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

