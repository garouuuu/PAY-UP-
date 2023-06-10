import java.awt.*;    
import javax.swing.*;
public class PayInstallment
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
 
	public PayInstallment()  
	{    

		String numbers[]={"11111111","2222222","3333333","44444444","555555555"};      
		
		frame = new OurFrame("Πληρωμή Δόσης", 500, 100, 400, 600);
 
		
	    label2 = new OurLabel("Αριθμός Πληρωμής ή IBAN",80,130,240,35,new Font("Verdana", Font.BOLD, 16));
	    t1= new OurTextField(102,165, 180,30);
	    
	    label4 = new OurLabel("Κάρτα",150,210,60,20,new Font("Verdana", Font.BOLD, 16));
	    cb=new JComboBox<Object>(numbers);    
	    cb.setBounds(102, 230,180,35);
	    
	    label3 = new OurLabel("Ποσό",150,280,60,20,new Font("Verdana", Font.BOLD, 16));
	    t3= new OurTextField(130,300,100,30);  
	 

	    b1 = new OurButton("Πληρωμή",210,360,90,30,new Color(0, 204, 102));
		b2 = new OurButton("Πίσω",10,500,90,30,new Color(0, 128, 255));
		b3 = new OurButton("Διαγραφή",80,360,100,30,new Color(0, 204, 102));
		
		
		
	    frame.add(label2);
	    frame.add(label4);
	    frame.add(label3);
	    frame.add(t1);
	    frame.add(t3);
	    frame.add(b1);
	    frame.add(b2);
	    frame.add(b3);	  
	    frame.add(cb);
	    
	    frame.setVisible(true);  

       
	}
}  
