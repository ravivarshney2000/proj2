import java.sql.*;
import java.util.*;
public class Operation extends DBconnection {
    void insert()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student id");
            int id = sc.nextInt();
            System.out.println("Enter student name");
            String name = sc.next();
            System.out.println("Enter student course");
            String course = sc.next();
            System.out.println("Enter student year");
            int year = sc.nextInt();
//            int id = 04;
//            String name = "ABC";
//            String course = "MCA";
//            int year = 2018;

            String insertquery = "insert into student values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(insertquery);

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, course);
            pst.setInt(4, year);

            pst.executeUpdate();
            System.out.println("Data inserted.........");


        }
        catch(Exception e)
        {
            System.out.println("data not inserted....."+e);
        }
    }
    void delete()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student id who you want to remove");
            int id = sc.nextInt();
//            int id = 1;
            String delquery = "delete from student where sid="+id;

            PreparedStatement pst =con.prepareStatement(delquery);
            pst.executeUpdate();
            System.out.println("Data deleted");
        }
        catch(Exception e)
        {
            System.out.println("Data not deleted"+e);
        }
    }
    void view()
    {
        try
        {
//            option 1 for all views
            String viewquery = "select * from student";
//            option 2  for int/numeric
//            int id = 1;
//            String viewquery = "select * from student where sid="+id;

//            option 3 for string/varchar
//            String branch="Btech";
//            String viewquery = "select * from student where scourse='"+branch+"'";
            Statement st = con.createStatement();

            ResultSet res = st.executeQuery(viewquery);
            while(res.next())
            {
                System.out.print(" "+res.getInt(1));
                System.out.print(" "+res.getString(2));
                System.out.print(" "+res.getString(3));
                System.out.print(" "+res.getInt(4));
                System.out.println();

            }
        }
        catch(Exception e)
        {
            System.out.println("Not viewable.."+e);
        }
    }
    void update()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student course you want to update");
            String branch = sc.next();
            System.out.println("Enter student course for which u want to update");
            String cbr = sc.next();
//            String branch = "MCA";
//            String cbr = "Btech";
            String updatequery = "update student set scourse='"+branch+"' where scourse='"+cbr+"'";
            PreparedStatement pst = con.prepareStatement(updatequery);
            pst.executeUpdate();
            System.out.println("Data update.........");

        }
        catch(Exception e)
        {
            System.out.println("Not updatable.."+e);
        }
    }
    void deleteall()
    {
        try
        {
            String trunquery = "truncate student;";
            PreparedStatement pst = con.prepareStatement(trunquery);
            pst.executeUpdate();
            System.out.println("Truncate done");
        }
        catch(Exception e)
        {
            System.out.println("Truncate fail.."+e);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Operation obj = new Operation();
//        obj.insert();
//          obj.delete();
//        obj.update();
//        obj.deleteall();
//        obj.view();
        System.out.println("*****Menu Driven*****");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. View");
        System.out.println("4. Delete");
        System.out.println("5. DeleteALL");
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1: obj.insert();
                break;
            case 2: obj.update();
                break;
            case 3: obj.view();
                break;
            case 4: obj.delete();
                break;
            case 5: obj.deleteall();
                break;
            default: System.out.println("You select wrong choice");


        }


    }
}

