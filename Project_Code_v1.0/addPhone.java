import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public class addPhone {  
       static Connection connection;
       static IndexPage indexP;
       static void myAdd1(ActionEvent e){
     Object o = e.getSource();
     
     if(o == AddPhoneBill.b1){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (phone_provider) VALUES (Cosmote)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
      if(o == AddPhoneBill.b2){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (phone_provider) VALUES (Vodafone)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddPhoneBill.b3){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (phone_provider) VALUES (Nova)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }//μεχρι εδω εισαγουμε πληροφορεια στην βαση μεσω των κουμπιων
    if(o == AddPhoneBill.b4) 
        {
                 String username = LogInPage.userText.getText();
                 String provider_num = AddPhoneBill.t1.getText();
            
             try {
                 String storedProcedure = "{call check_prov(?, ?)}";//εδω καλουμε ενα store procudure για να εχουμε την πιο σωστη συνδεση με την βαση
                 CallableStatement stmt = connection.prepareCall(storedProcedure);
                 stmt.setString(1, username);
                 
                 stmt.setString(2,provider_num);
                 stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
                 stmt.execute();
                 String outputParameter = stmt.getString(3);
                 if (outputParameter =="true" ) {
                     // Login successful, proceed to index page
                     String sql = "INSERT INTO bills (phone) VALUES (?)";
                     indexP = new IndexPage();
                     AddPhoneBill.frame.dispose(); // Close the login page
                 } else {
                     // Login failed, display an error message
                     System.out.println("Αποτυχία Αντιστοίχισης");
                     PopupMessage popup = new PopupMessage(LogInPage.frame,"Ο λογαριασμός με αυτά τα στοιχεία δεν υπάρχει");
                 }

             } catch (SQLException ex) {
                 ex.printStackTrace();
             }
            
        }
}
}