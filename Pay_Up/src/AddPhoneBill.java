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
		frame = new OurFrame("Προσθήκη Λογαριασμού Τηλεφώνου", 500, 100, 400, 600);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Τηλεφώνου",10,5,500,100,new Font("Verdana", Font.BOLD, 18));
	    label1 = new OurLabel("Αριθμός Παροχής",102,240,160,30,new Font("Verdana", Font.BOLD, 16));
	    t1= new OurTextField(107,280, 150,30);
	    b1 = new OurButton("Cosmote",40,100,95,30,new Color(102,204, 0));
		b2 = new OurButton("Vodafone",145,100,95,30,new Color(102,204, 0));
		b3 = new OurButton("Nova",250,100,95,30,new Color(102,204, 0));
		b4 = new OurButton("Υποβολή",140,330,90,30,new Color(0, 204, 102));
		b5 = new OurButton("Πίσω",10,500,90,40,new Color(0, 128, 255));
	   
	
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
