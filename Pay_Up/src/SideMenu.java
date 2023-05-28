import java.awt.*;

public class SideMenu {
	static OurFrame menuframe;
	static OurButton clicked1;
	static OurButton clicked2;
	static OurButton clicked3;
	static OurButton clicked4;

	public SideMenu(){
		menuframe= new OurFrame("Mενού", 500, 100, 650, 600);
		clicked1= new OurButton("Προσθήκη/Διαγραφή Τραπεζικού Λογαριασμού", 300,20,300,30,new Color(255, 255, 102));
		clicked2= new OurButton("Αλλαγή Προσωπικών Στοιχείων", 300,50,300,30,new Color(255, 255, 102));
		clicked3= new OurButton("FAQs", 300,80,80,30,new Color(255, 255, 102));
		clicked4= new OurButton("Αποσύνδεση", 300,110,150,30,new Color(255, 255, 102));
		
		menuframe.getContentPane().setBackground(new Color(255, 255, 51));
		menuframe.setVisible(true);
		menuframe.add(clicked1);
		menuframe.add(clicked2);
		menuframe.add(clicked3);
		menuframe.add(clicked4);
	}
}