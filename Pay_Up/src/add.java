import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public class add {  
       static Connection connection;
       static IndexPage indexP;
       static void myAdd2(ActionEvent e){
     Object o = e.getSource();
      if(o == AddInstallment.b1) 
        {
              String installment = AddInstallment.t1.getText();
              String installment1 = AddInstallment.t2.getText();
         try {
             connection = DatabaseConnection.getConnection();
             String sql = "INSERT INTO bills (installment) VALUES (?)";
            } 
           catch (SQLException ex) {
            ex.printStackTrace();
             }
        
             } 
             }
            
        }



