import java.sql.*;
public class DBconnection {
    Connection con;
    DBconnection()
    {
        try
        {
//          Step1 load the driver class
            Class.forName("com.mysql.jdbc.Driver");

//          Step2 create the connection object
            String connectionURL = "jdbc:mysql://localhost:3306/secddb";
            String dbuser = "root";
            String dbpass = "Trivenk";
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