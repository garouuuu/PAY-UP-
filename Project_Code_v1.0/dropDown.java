//δεν λειτουργει η μεθοδος παρουσιαζει errors
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.*; 
public class dropDown {  
   static Connection connection;

    static void myAdd(ActionEvent e){
     Object o = e.getSource();
     if(o == IndexPage.cb)
      {
             String prov_num ;
                 String pay_num = PayElectricBill.t1.getText();
            
             try {
                 connection = DatabaseConnection.getConnection();
                 String query = "SELECT electric FROM bills";
                 try (Statement statement = connection.createStatement()) {
                try (ResultSet resultSet = statement.executeQuery(query)) {
                    JComboBox<String> cb = new JComboBox<>();
                    while (resultSet.next()) {
                        String employeeName = resultSet.getString("electric");
                        cb.addItem(employeeName);
                    }
                    // Add the populated combo box to your GUI
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
  }
}
