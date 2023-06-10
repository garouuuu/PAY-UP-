import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public class addAccount {  
       static Connection connection;
       static IndexPage indexP;

    static void myAdd(ActionEvent e){
     Object o = e.getSource();
     if (o == AddBankAccount.nextButton) 
        {
             String name = AddBankAccount.fAndLNameText.getText();
                String card_num = AddBankAccount.cardNumText.getText();
                 String cvv = AddBankAccount.CVVText.getText();
                 String date= AddBankAccount.expDateText.getText();
             try {
                 String query = "SELECT * FROM bank WHERE name = ? AND card_num = ? AND cvv = ? AND date =?";
                 PreparedStatement preparedStatement = connection.prepareStatement(query);
                 preparedStatement.setString(1, name);
                 preparedStatement.setString(2, card_num);
                 preparedStatement.setString(3, cvv);
                 preparedStatement.setString(4, date);
                 ResultSet resultSet3 = preparedStatement.executeQuery();
                 if (resultSet3.next()) {
                     // Login successful, proceed to index page
                     String sql = "INSERT INTO bank_info(card_num, date, cvv, name) VALUES (?, ? ,?, ?)";
                     indexP = new IndexPage();
                     AddBankAccount.frame.dispose(); // Close the login page
                 } else {
                     // Login failed, display an error message
                     System.out.println("Αποτυχία Αντιστοίχισης");
                     PopupMessage popup = new PopupMessage(LogInPage.frame,"Ο λογαριασμός με αυτά τα στοιχεία δεν υπάρχει");
                 }
                 resultSet3.close();
                 preparedStatement.close();
             } catch (SQLException ex) {
                 ex.printStackTrace();
             }
            
        }
    }
}