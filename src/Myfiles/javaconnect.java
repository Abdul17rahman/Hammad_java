
package Myfiles;

import java.sql.*;
import javax.swing.JOptionPane;
import com.microsoft.sqlserver.jdbc.*;

public class javaconnect {
    
    Connection conn = null;
    
    public static Connection connectdb(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Xtreem;user=AbdulRahman;password=Abdul";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
