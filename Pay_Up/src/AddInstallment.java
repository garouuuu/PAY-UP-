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
		
		frame = new OurFrame("Προσθήκη Δόσης", 500, 100, 400, 600);
	    windowLabel = new OurLabel("Προσθήκη Δόσης",90,5,500,100,new Font("Verdana", Font.BOLD, 23));
	    
	    label1 = new OurLabel("Αριθμός Πληρωμής",102,130,180,35,new Font("Verdana", Font.BOLD, 16));
	    t1= new OurTextField(102,165, 180,30);
	    
	    label3 = new OurLabel("Ή",180,210,150,20,new Font("Verdana", Font.BOLD, 15));

	    
	    label2 = new OurLabel("IBAN",170,250,150,20,new Font("Verdana", Font.BOLD, 16));
	    t2= new OurTextField(102,280, 180,30);

	    b1 = new OurButton("Υποβολή",140,350,90,30,new Color(0, 204, 102));
		b2 = new OurButton("Πίσω",10,500,90,40,new Color(0, 128, 255));
	    
	  
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
     
