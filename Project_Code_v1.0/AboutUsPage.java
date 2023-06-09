import java.awt.Color;
import java.awt.Font;

public class AboutUsPage 
{
	static OurFrame frame;
	static OurLabel windowLabel;
	static OurLabel infoLabel;
	static OurButton backButton ;
	
	public AboutUsPage()
	{
		frame = new OurFrame("About Us", 500, 100, 400, 600);
    	windowLabel = new OurLabel("Λίγα Λόγια Για Εμάς",40,3,300,100,new Font("Verdana", Font.BOLD, 25));
    	infoLabel = new OurLabel("<html>Αυτή η εφαρμογή σας επιτρέπει να αποθηκεύετε με <br>"
    			+ " ασφάλεια τις πληροφορίες των τραπεζικών σας <br>"
    			+ " καρτών και να πληρώνετε άνετα διάφορους <br> "
    			+ "λογαριασμούς.Δίνουμε προτεραιότητα στην ασφάλεια <br>"
    			+ "και την ιδιωτικότητα των δεδομένων σας για μια <br>"
    			+ "αξιόπιστη και άνετη εμπειρία.<br>"
    			+ "Εάν έχετε οποιεσδήποτε ερωτήσεις ή χρειάζεστε <br>"
    			+ " βοήθεια, μην διστάσετε να επικοινωνήσετε με την <br>"
    			+ "ομάδα υποστήριξής μας.<br>"
    			+ "Σας ευχαριστούμε που επιλέξατε την εφαρμογή μας! <br><br>"
    			+ "email επικοινωνίας: payUpcustomerserv@gmail.com</html>",2, 90, 500, 280,new Font("Verdana", Font.PLAIN, 14));
    	
		backButton = new OurButton("Πίσω",140, 400, 90, 40,new Color(0, 128, 255));

    	
    	frame.add(windowLabel);
    	frame.add(infoLabel);
    	frame.add(backButton);
    	frame.setVisible(true);
	}

}