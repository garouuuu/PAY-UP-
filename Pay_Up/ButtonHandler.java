import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

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
    static Pay3rdChooseBill pay3th;
    static Pay3rdElectric p3thElectric;
    static Pay3rdWater p3thWater;
    static Pay3rdPhone p3thPhone;
    static Connection connection;
    static OurFrame frame;
    static OurLabel label;
        
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
            LogInPage.frame.dispose();  // Close the login page
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
            
        }else if(o == IndexPage.b)
        {
            pay3th = new Pay3rdChooseBill();
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
            
        }else if(o==PayElectricBill.b3)//λογω ελειψεις χρονου δεν εχουμε ελεγξει αν λειτουργει σωστα η βαση εδω αλλα λογικα δουλευει
        {
           String user=LogInPage.userLabel.getText();
            int result = JOptionPane.showConfirmDialog(frame,"Θέλετε να διαγραφεί αυτός ο λογαριασμός;", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               String query = "DELETE electric, electric_provider FROM bills WHERE user=b_username";
            }else if (result == JOptionPane.NO_OPTION){
             
            }
         }
            
       
    
      //For the buttons in PayWaterBill***********************************************
        if(o == PayWaterBill.b2)
        {
            indexP = new IndexPage();
            PayWaterBill.frame.dispose();
            
        }else if(o==PayWaterBill.b3)//λογω ελειψεις χρονου δεν εχουμε ελεγξει αν λειτουργει σωστα η βαση εδω αλλα λογικα δουλευει
        {
           String user=LogInPage.userLabel.getText();
            int result = JOptionPane.showConfirmDialog(frame,"Θέλετε να διαγραφεί αυτός ο λογαριασμός;", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               String query = "DELETE water FROM bills WHERE user=b_username";
            }else if (result == JOptionPane.NO_OPTION){
            
           }
         }
        
      //For the buttons in PayPhoneBill***********************************************
        if(o == PayPhoneBill.b2)
        {
            indexP = new IndexPage();
            PayPhoneBill.frame.dispose();
            
        }else if(o==PayPhoneBill.b3)//λογω ελειψεις χρονου δεν εχουμε ελεγξει αν λειτουργει σωστα η βαση εδω αλλα λογικα δουλευει
        {
           String user=LogInPage.userLabel.getText();
            int result = JOptionPane.showConfirmDialog(frame,"Θέλετε να διαγραφεί αυτός ο λογαριασμός;", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
              String query = "DELETE phone, phone_provider FROM bills WHERE user=b_username";
            }else if (result == JOptionPane.NO_OPTION){
           
            }
         }
      //For the buttons in PayInstallment***********************************************
        if(o == PayInstallment.b2)
        {
            indexP = new IndexPage();
            PayInstallment.frame.dispose();
            
        }else if(o==PayInstallment.b3)//λογω ελειψεις χρονου δεν εχουμε ελεγξει αν λειτουργει σωστα η βαση εδω αλλα λογικα δουλευει
        {
           String user=LogInPage.userLabel.getText();
            int result = JOptionPane.showConfirmDialog(frame,"Θέλετε να διαγραφεί αυτός ο λογαριασμός;", "Swing Tester",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
             String query = "DELETE installment FROM bills WHERE user=b_username";
            }else if (result == JOptionPane.NO_OPTION){
    
            }
         }
        /* εμφανιζει errors, ειναι για τις ενναλαγες στις σελιδες απο την σελιδα "Πληρωμη Λογαρισμου Τριτου"
         * if(o == Pay3thChooseBill.b1) 
        {
            p3thElectric = new Pay3thElectric();           
            Pay3thChooseBill.frame.dispose();
            
        }else if(o == Pay3thChooseBill.b2)
        {
            p3thWater = new Pay3thWater();
            Pay3thChooseBill.frame.dispose();
            
        }else if(o == Pay3thChooseBill.b3){
            p3thPhone = new Pay3thPhone();
            Pay3thChooseBill.frame.dispose();
    }*/
}
}