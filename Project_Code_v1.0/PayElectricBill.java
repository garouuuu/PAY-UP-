import java.awt.*;    
import javax.swing.*; 
import java.awt.event.*;   
    
public class PayElectricBill
{   
	
	static JComboBox<Object> cb;
	static OurFrame frame;
	static OurLabel windowLabel;
	static OurLabel label;
	static OurLabel label1;
	static OurLabel label2;
	static OurLabel label3;
	static OurLabel label4;
	static OurButton b1;
	static OurButton b2;
	static OurButton b3;
	static OurTextField t1;
	static OurTextField t2;
	static OurTextField t3;
  
// constructor    
	public PayElectricBill()  
	{     
		
		frame = new OurFrame("Προσθήκη Λογαριασμού Ρεύματος", 500, 100, 400, 700);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Ρεύματος",50,20,250,20,new Font("Verdana", Font.BOLD, 17));
	    //label = new OurLabel("",95,20,250,20,new Font("Verdana", Font.BOLD, 14));
	    label1 = new OurLabel("Αριθμός Παροχής",102,90,150,20,new Font("Verdana", Font.BOLD, 14));
	    label2 = new OurLabel("Αριθμός Πληρωμής",100,140,150,20,new Font("Verdana", Font.BOLD, 14));
	    label3 = new OurLabel("Ποσό",135,260,60,20,new Font("Verdana", Font.BOLD, 14));
	    label4 = new OurLabel("Κάρτα",135,210,60,20,new Font("Verdana", Font.BOLD, 14));
	    t1= new OurTextField(80,220, 150,30);
	    t2= new OurTextField(80,160, 150,30);
	    t3= new OurTextField(120,280, 60,30);    
	    b1 = new OurButton("Πληρωμή",105,320,90,20,new Color(0, 204, 102));
		b2 = new OurButton("Πίσω",10,380,80,20,new Color(0, 204, 102));
		b3 = new OurButton("Διαγραφή",240,380,90,20,new Color(0, 204, 102));
		
		
		String numbers[]={"11111111","2222222","3333333","44444444","555555555"};        
	        
	    cb=new JComboBox<Object>(numbers);    
	    cb.setBounds(80, 230,150,20);    
	 
	    //frame.add(label);
	    frame.add(label1);
	    frame.add(label2);
	    frame.add(label4);
	    frame.add(label3);
	    frame.add(t1);
	    frame.add(t2);
	    frame.add(t3);
	    frame.add(b1);
	    frame.add(b2);
	    frame.add(b3);	  
	    frame.add(cb);
	    
	    frame.setVisible(true); 
		}

       
}  
     

