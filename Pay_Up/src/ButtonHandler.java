import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ButtonHandler implements ActionListener {
   
	static SignUpPage signUpP;
	static LogInPage logInP;
	static IndexPage indexP;
	static AboutUsPage aboutusP;
	static AddBankAccount bankAccP;
	static AddElectricBill addElecP;
	static AddWaterBill addWatP;
	static AddInstallment addInstP;
	static AddPhoneBill addPhoP;
	static PayElectricBill payElecP;
	static PayInstallment payInstP;
	static PayPhoneBill payPhoP;
	static PayWaterBill payWatP;
	static Connection connection;
	static SideMenu sMenuPage;
	
		
	public ButtonHandler() {
        // Connect to the database
        try {
            connection = DatabaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
	
	@Override
    public void actionPerformed(ActionEvent e) {
        // Handle the button action here
    	
    	Object o = e.getSource();
    	
    	//For the buttons in LogInPage**********************************************
        if (o == LogInPage.loginButton) 
        {
        	 String username = LogInPage.userText.getText();
             String password = LogInPage.passwordText.getText();
        	
             try {
                 String query = "SELECT * FROM user WHERE username = ? AND password = ?";
                 PreparedStatement preparedStatement = connection.prepareStatement(query);
                 preparedStatement.setString(1, username);
                 preparedStatement.setString(2, password);
                 ResultSet resultSet = preparedStatement.executeQuery();

                 if (resultSet.next()) {
                     // Login successful, proceed to index page
                     indexP = new IndexPage();
                     LogInPage.frame.dispose(); // Close the login page
                 } else {
                     // Login failed, display an error message
                     System.out.println("Login failed");
                     PopupMessage popup = new PopupMessage(LogInPage.frame,"Ο λογαριασμός με αυτά τα στοιχεία δεν υπάρχει");
                 }

                 resultSet.close();
                 preparedStatement.close();
             } catch (SQLException ex) {
                 ex.printStackTrace();
             }
        	
        /*	
        	indexP = new IndexPage();
        	LogInPage.frame.dispose();	// Close the login page
        */    
        } else if (o == LogInPage.signupButton) 
        {
    		signUpP = new SignUpPage();
            LogInPage.frame.dispose(); 

        } else if (o == LogInPage.aboutusButton) 
        {
        	aboutusP = new AboutUsPage();
        	LogInPage.frame.dispose();
        }
        
        
        //For the buttons in AboutUsPage***********************************************
        if(o == AboutUsPage.backButton)
        {
        	logInP = new LogInPage();
        	AboutUsPage.frame.dispose();
        }
        
        
      //For the buttons in SignUpPage***********************************************
        if(o == SignUpPage.backButton)
        {
        	logInP = new LogInPage();
        	SignUpPage.frame.dispose();
        }else if(o == SignUpPage.nextButton)
        {
        	bankAccP = new AddBankAccount();
        	SignUpPage.frame.dispose();
        	
        }
        
      //For the buttons in AddBankAccount***********************************************
        if(o == AddBankAccount.backButton)
        {
        	signUpP = new SignUpPage();
        	AddBankAccount.frame.dispose();
        	
        }else if(o == AddBankAccount.nextButton)
        {
        	indexP = new IndexPage();
        	AddBankAccount.frame.dispose();
        	
        }
        
        
      //For the + buttons in IndexPage***********************************************
        if(o == IndexPage.b1)
        {
        	addElecP = new AddElectricBill();
        	IndexPage.frame.dispose();
        	
        }else if(o == IndexPage.b2)
        {
        	addWatP = new AddWaterBill();
        	IndexPage.frame.dispose();
        	
        }else if(o == IndexPage.b3)
        {
        	addPhoP = new AddPhoneBill();
        	IndexPage.frame.dispose();
        	
        }else if(o == IndexPage.b4)
        {
        	addInstP = new AddInstallment();
        	IndexPage.frame.dispose();
        	
        }
        else if(o==IndexPage.b5)
        {
        	sMenuPage= new SideMenu();
        	IndexPage.frame.dispose();
        }
        
        
        
      //For the buttons in AddElectricBill***********************************************
        if(o == AddElectricBill.b11)
        {
        	indexP = new IndexPage();
        	AddElectricBill.frame.dispose();
        	
        }else if(o==AddElectricBill.b10)
        {
        	indexP = new IndexPage();
        	AddElectricBill.frame.dispose();
        	
        }
        
        
      //For the buttons in AddWaterBill***********************************************
        if(o == AddWaterBill.b1)
        {
        	indexP = new IndexPage();
        	AddWaterBill.frame.dispose();
        	
        }else if(o==AddWaterBill.b2)
        {
        	indexP = new IndexPage();
        	AddWaterBill.frame.dispose();
        	
        }
        
        
      //For the buttons in AddPhoneBill***********************************************
        if(o == AddPhoneBill.b4)
        {
        	indexP = new IndexPage();
        	AddPhoneBill.frame.dispose();
        	
        }else if(o==AddPhoneBill.b5)
        {
        	indexP = new IndexPage();
        	AddPhoneBill.frame.dispose();
        	
        }
        
        
      //For the buttons in AddInstallment***********************************************
        if(o == AddInstallment.b1)
        {
        	indexP = new IndexPage();        	
        	AddInstallment.frame.dispose();
        	
        }else if(o == AddInstallment.b2)
        {
        	indexP = new IndexPage();
        	AddInstallment.frame.dispose();
        	
        }
        
      //For the buttons in PayElectricBill***********************************************
        if(o == PayElectricBill.b2)
        {
        	indexP = new IndexPage();
        	PayElectricBill.frame.dispose();
        	
        }
        
      //For the buttons in PayWaterBill***********************************************
        if(o == PayWaterBill.b2)
        {
        	indexP = new IndexPage();
        	PayWaterBill.frame.dispose();
        	
        }
        
      //For the buttons in PayPhoneBill***********************************************
        if(o == PayPhoneBill.b2)
        {
        	indexP = new IndexPage();
        	PayPhoneBill.frame.dispose();
        	
        }
      //For the buttons in PayInstallment***********************************************
        if(o == PayInstallment.b2)
        {
        	indexP = new IndexPage();
        	PayInstallment.frame.dispose();
        	
        }
        
       //For the buttons in SideMenu****************************************************
        if(o == SideMenu.clicked1) {
        	bankAccP= new AddBankAccount();
        	SideMenu.menuframe.dispose();
        	
        }else if(o==SideMenu.clicked2) {
        	signUpP= new SignUpPage();
        	SideMenu.menuframe.dispose();
        	
        }else if(o== SideMenu.clicked3) {
        	aboutusP= new AboutUsPage();
        	SideMenu.menuframe.dispose();
        	
        }else if(o== SideMenu.clicked4) {
        	logInP= new LogInPage();
        	SideMenu.menuframe.dispose();
        }
        
        
        
	}
}