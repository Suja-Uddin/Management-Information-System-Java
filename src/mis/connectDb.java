
package mis;
import java.sql.*;
import javax.swing.*;

public class connectDb {
    //Connection con=null;
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:project123.sqlite");
            
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
