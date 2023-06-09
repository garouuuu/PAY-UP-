// import statement  
import java.awt.*;    
import javax.swing.*;    
    
public class AddInstallment
{    
	static OurFrame frame;
	static OurLabel windowLabel;
	static OurLabel label1;  
	static OurLabel label2;  
	static OurLabel label3; 
	static OurButton b1;
	static OurButton b2;
	
	static OurTextField t1;
	static OurTextField t2;

   
	public AddInstallment()  
	{    
		
		frame = new OurFrame("Προσθήκη Δόσης", 500, 100, 400, 700);
	    windowLabel = new OurLabel("Προσθήκη Δόσης",28,5,500,100,new Font("Verdana", Font.BOLD, 17));
	    label1 = new OurLabel("Αριθμός Πληρωμής",102,130,150,20,new Font("Verdana", Font.BOLD, 14));
	    label2 = new OurLabel("IBAN",140,220,150,20,new Font("Verdana", Font.BOLD, 14));
	    label3 = new OurLabel("Ή",150,190,150,20,new Font("Verdana", Font.BOLD, 14));
	    t1= new OurTextField(80,150, 150,30);
	    t2= new OurTextField(80,240, 150,30);
	    b1 = new OurButton("Υποβολή",110,290,90,20,new Color(0, 204, 102));
		b2 = new OurButton("Πίσω",10,380,80,20,new Color(0, 204, 102));
	    
	    
	  
	    
	    frame.add(windowLabel);
	    frame.add(label1);
	    frame.add(label2);
	    frame.add(label3);
	    frame.add(label1);
	    frame.add(t1);
	    frame.add(t2);
	    frame.add(b1);
	    frame.add(b2);
	    
	    
	    frame.setVisible(true);    
	}    
	   
}  
     
