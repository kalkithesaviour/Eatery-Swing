package db;
import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static Connection c;
    public static Statement st;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/eatery", "vishal", "password");
            st = c.createStatement();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void closeConnection() {
        try {
            c.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
