import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public class addElectric {  
       static Connection connection;
       static IndexPage indexP;

    static void myAdd(ActionEvent e){
     Object o = e.getSource();
     
     if(o == AddElectricBill.b1){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (NRG)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
      if(o == AddElectricBill.b2){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (Elpedison)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b3){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (Volton)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b4){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (Protergia)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b5){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (Watt+Volt)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b6){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (Ήρων)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b7){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (ZeniΘ)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b8){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (Volterra)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }
    if(o == AddElectricBill.b9){
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (electric_provider) VALUES (DEI)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
    }//μεχρι εδω εισαγουμε πληροφορια στην βαση μεσω των κουμπιων
    if(o == AddElectricBill.b10) 
        {
                 String username = LogInPage.userText.getText();
                 String provider_num = AddElectricBill.t1.getText();
            
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
                     String sql = "INSERT INTO bills (electric) VALUES (?)";
                     indexP = new IndexPage();
                     AddElectricBill.frame.dispose(); // Close the login page
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