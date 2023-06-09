import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3308/tl_database";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        try {
            // Register the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Connection successful
            System.out.println("Connection to the database established successfully.");
        } catch (ClassNotFoundException e) {
            // MySQL driver not found
            System.out.println("MySQL driver not found. Error: " + e.getMessage());
        }

        return connection;
    }
}
