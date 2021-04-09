import java.sql.*;
public class DBconnection {
        Connection con;
        DBconnection()
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String connectionURL = "jdbc:mysql://localhost:3306/EMPLOYEE";
                String dbuser = "root";
                String dbpass = "ravi";
                con = DriverManager.getConnection(connectionURL,dbuser,dbpass);
                System.out.println("Connection success");
            }
            catch(Exception e)
            {
                System.out.println("Connection failed.."+e);
            }
        }
        public static void main(String args[])
        {
            DBconnection obj = new DBconnection();
        }
}

