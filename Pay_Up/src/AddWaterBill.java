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
		frame = new OurFrame("Προσθήκη Λογαριασμού Νερού", 500, 100, 400, 600);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Νερού",15,5,500,100,new Font("Verdana", Font.BOLD, 19));
	    label1 = new OurLabel("Αριθμός Παροχής",102,300,160,30,new Font("Verdana", Font.BOLD, 16));
		
	    t1= new OurTextField(107,340, 150,30);
	    b1 = new OurButton("Υποβολή",140,385,90,30,new Color(0, 204, 102));
		b2 = new OurButton("Πίσω",10,500,90,40,new Color(0, 128, 255));
	  
		
		frame.add(windowLabel);
	    frame.add(label1);
	    frame.add(t1);
	
	    frame.add(b1);
	    frame.add(b2);
	    
	    frame.setVisible(true);    
	}    

   
}  