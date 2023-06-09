// import statement  
import java.awt.*;    
import javax.swing.*;    
    
public class AddWaterBill
{    
	static OurFrame frame;
	static OurLabel windowLabel;
	static OurLabel label1;
	static OurButton b1;
	static OurButton b2;
	static OurTextField t1;

	
	// constructor    
	public AddWaterBill()  
	{    
		frame = new OurFrame("Προσθήκη Λογαριασμού Νερού", 500, 100, 400, 700);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Ρεύματος",50,20,250,20,new Font("Verdana", Font.BOLD, 17));
	    label1 = new OurLabel("Αριθμός Παροχής",102,200,150,20,new Font("Verdana", Font.BOLD, 14));
	    t1= new OurTextField(80,220, 150,30);
	    b1 = new OurButton("Υποβολή",110,270,90,20,new Color(0, 204, 102));
		b2 = new OurButton("Πίσω",10,380,80,20,new Color(0, 204, 102));
	  
	
		frame.add(windowLabel);
	    frame.add(label1);
	    frame.add(t1);
	
	    frame.add(b1);
	    frame.add(b2);
	    
	    frame.setVisible(true);    
	}    

   
}  