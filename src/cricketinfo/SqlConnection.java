package cricketinfo;

import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class SqlConnection {

    public static Connection getConnection() {
     
	
	Connection con = null;
	try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/infocricket","root","");
        }
        catch(Exception ex)
                {
                   System.out.println(ex.getMessage());
                }
		
	return con;
}
}