// import statement  
import java.awt.*;    
import javax.swing.*;    
    
public class AddPhoneBill  
{    
	static OurFrame frame;
	static OurLabel windowLabel; 
	static OurLabel label1;
	static OurTextField t1;
	static OurButton b1;
	static OurButton b2;
	static OurButton b3;
	static OurButton b4;
	static OurButton b5;
	
	  
	// constructor    
	public AddPhoneBill()  
	{    
	        
	    frame = new OurFrame("Προσθήκη Λογαριασμού Τηλεφώνου", 500, 100, 400, 700);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Ρεύματος",50,20,250,20,new Font("Verdana", Font.BOLD, 17));
	    label1 = new OurLabel("Αριθμός Πληρωμής",102,200,150,20,new Font("Verdana", Font.BOLD, 14));
	    t1 = new OurTextField(80,220, 150,30);
	    b1 = new OurButton("Cosmote",20,100,95,30,new Color(0, 204, 102));
		b2 = new OurButton("Vodafone",120,100,95,30,new Color(0, 204, 102));
		b3 = new OurButton("Nova",220,100,95,30,new Color(0, 204, 102));
		b4 = new OurButton("Υποβολή",110,270,90,20,new Color(0, 204, 102));
		b5 = new OurButton("Πίσω",10,380,80,20,new Color(0, 204, 102));
	   
	
	
	    frame.add(windowLabel);
	    frame.add(label1);
	    frame.add(t1);
	    frame.add(b1);
	    frame.add(b2);
	    frame.add(b3);
	    frame.add(b4);
	    frame.add(b5);
	    
	    
	    frame.setVisible(true);    
	}    
	   
}  

