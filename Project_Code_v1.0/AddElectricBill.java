// import statement  
import java.awt.*;    
import javax.swing.*;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;    
public class AddElectricBill  
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
	static addElectric a; 
	  
	// constructor    
	public AddElectricBill()  
	{    
		
		frame = new OurFrame("Προσθήκη Λογαριασμού Ρεύματος", 500, 100, 400, 700);
	    windowLabel = new OurLabel("Προσθήκη Λογαριασμού Ρεύματος",28,5,500,100,new Font("Verdana", Font.BOLD, 17));
	    label1 = new OurLabel("Αριθμός Παροχής",102,200,150,20,new Font("Verdana", Font.BOLD, 14));
	
		
		b1 = new OurButton("NRG",10,100,65,20,new Color(0, 204, 102));
		b2 = new OurButton("Elpedison",25,100,95,20,new Color(0, 204, 102));
		b3 = new OurButton("Volton",235,60,80,20,new Color(0, 204, 102));
		b4 = new OurButton("Protergia",125,100,95,20,new Color(0, 204, 102));
		b5 = new OurButton("Watt+Volt",55,140,90,20,new Color(0, 204, 102));
		b6 = new OurButton("Ήρων",80,60,70,20,new Color(0, 204, 102));
		b7 = new OurButton("ZeniΘ",155,60,75,20,new Color(0, 204, 102));
		b8 = new OurButton("Volterra",150,140,90,20,new Color(0, 204, 102));
		b9 = new OurButton("DEI",225,100,60,20,new Color(0, 204, 102));
		b10 = new OurButton("Υποβολή",110,270,90,20,new Color(0, 204, 102));
		b11 = new OurButton("Πίσω",10,380,80,20,new Color(0, 204, 102));
		t1= new OurTextField(80,220, 150,30);
 

	    
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
	    
	    
	   	    
	    frame.setVisible(true); // Exhibit the frame 
	  
	    
	}    
	     static void myAdd(ActionEvent e){
          Object o = e.getSource();
	    a =new addElectric(); 
	    if(o==AddElectricBill.b10)
	    { 
	       a = new addElectric();
            }  
        }
}
