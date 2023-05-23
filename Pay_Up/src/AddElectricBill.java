// import statement  
import java.awt.*;    
import javax.swing.*;    
    
public class AddElectricBill extends JButton
{    
	static OurFrame frame;
	static OurLabel windowLabel;
	static OurLabel label1;
	static OurButton b1;
	static OurButton b2;
	static OurButton b3;
	static OurButton b4;
	static OurButton b5;
	static OurButton b6;
	static OurButton b7;
	static OurButton b8;
	static OurButton b9;
	static OurButton b10;
	static OurButton b11;
	static OurTextField t1;
	
	static DltButton deleteButton;

	  
	// constructor    
	public AddElectricBill()  
	{    
		

   	 // Load the delete icon image from the src directory (for the bin icon)
       ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
       ImageIcon binIcon = new ImageIcon(classLoader.getResource("bin3.png"));
		
		frame = new OurFrame("Προσθήκη Λογαριασμού Ρεύματος", 500, 100, 400, 600);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Ρεύματος",15,5,500,100,new Font("Verdana", Font.BOLD, 19));
	    label1 = new OurLabel("Αριθμός Παροχής",102,300,160,30,new Font("Verdana", Font.BOLD, 16));
	    deleteButton = new DltButton(binIcon);
		
		b1 = new OurButton("NRG",20,100,80,25,new Color(102,204, 0));
		b6 = new OurButton("Ήρων",110,100,80,25,new Color(102, 204, 0));
		b7 = new OurButton("ZeniΘ",200,100,80,25,new Color(102, 204, 0));
		b3 = new OurButton("Volton",290,100,80,25,new Color(102, 204, 0));

		b2 = new OurButton("Elpedison",45,150,100,25,new Color(102, 204, 0));
		b4 = new OurButton("Protergia",155,150,100,25,new Color(102, 204, 0));
		b9 = new OurButton("DEI",265,150,80,25,new Color(102, 204, 0));

		b5 = new OurButton("Watt+Volt",80,200,100,25,new Color(102, 204, 0));
		b8 = new OurButton("Volterra",190,200,100,25,new Color(102, 204, 0));
		
		b10 = new OurButton("Υποβολή",140,385,90,30,new Color(0, 204, 102));
		b11 = new OurButton("Πίσω",10,500,90,40,new Color(0, 128, 255));
		t1= new OurTextField(107,340, 150,30);
 

	    
	    frame.add(windowLabel);
	    frame.add(label1);
	    frame.add(b1);
	    frame.add(b2);
	    frame.add(b3);
	    frame.add(b4);
	    frame.add(b5);
	    frame.add(b6);
	    frame.add(b7);
	    frame.add(b8);
	    frame.add(b9);
	    frame.add(b10);
	    frame.add(b11);
	    frame.add(t1);
	    frame.add(deleteButton);
	 
	    
  
	    frame.setVisible(true); // Exhibit the frame 
	    
	    
	    
	}    
	    
}  

