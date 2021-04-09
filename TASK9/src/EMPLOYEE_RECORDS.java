import java.sql.*;
import java.util.*;

public class EMPLOYEE_RECORDS extends DBconnection{
    void insert()
    {
        try
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter EMP ID:");
            int id=sc.nextInt();
            System.out.println("Enter Name");
            String name=sc.next();
            System.out.println("Enter Mobile");
            String mobile=sc.next();
            System.out.println("Enter EMAIL");
            String email=sc.next();


            String insertquery = "insert into EMPLOYEE values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(insertquery);

            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3,mobile);
            pst.setString(4,email);

            pst.executeUpdate();
            System.out.println("Data inserted.........");


        }
        catch(Exception e)
        {
            System.out.println("data not inserted....."+e);
        }
    }

    void update()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter EMP ID is to be updated:");
            int id = sc.nextInt();
            System.out.println("Enter NEW details");
            String mobile = sc.next();
            String updatequery = "update EMPLOYEE set mobile='"+mobile+"' where eid='"+id+"'";
            PreparedStatement pst = con.prepareStatement(updatequery);
            pst.executeUpdate();
            System.out.println("Data update.........");

        }
        catch(Exception e)
        {
            System.out.println("Not updatable.."+e);
        }
    }

    void viewALL()
    {
        try
        {
            String viewquery = "select * from EMPLOYEE";
            Statement st = con.createStatement();

            ResultSet res = st.executeQuery(viewquery);
            while(res.next())
            {
                System.out.print(" "+res.getInt(1));
                System.out.print(" "+res.getString(2));
                System.out.print(" "+res.getString(3));
                System.out.print(" "+res.getString(4));
                System.out.println();

            }
        }
        catch(Exception e)
        {
            System.out.println("Not viewable.."+e);
        }
    }


    void view()
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter EMP ID is to be updated:");
            int id = sc.nextInt();
            String viewquery = "select * from EMPLOYEE where sid="+id;
            Statement st = con.createStatement();

            ResultSet res = st.executeQuery(viewquery);
            while(res.next())
            {
                System.out.print(" "+res.getInt(1));
                System.out.print(" "+res.getString(2));
                System.out.print(" "+res.getString(3));
                System.out.print(" "+res.getString(4));
                System.out.println();

            }
        }
        catch(Exception e)
        {
            System.out.println("Not viewable.."+e);
        }
    }






    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EMPLOYEE_RECORDS obj = new EMPLOYEE_RECORDS();
        System.out.println("*****Menu Driven*****");
        System.out.println("1. Insert");
        System.out.println("2. Update");
        System.out.println("3. VIEW by EMP ID");
        System.out.println("4. VIEW ALL");
        System.out.println("5. EXIT");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1: obj.insert();
                break;
            case 2: obj.update();
                break;
            case 3: obj.view();
                break;
            case 4: obj.viewALL();
                break;
            case 5:
                System.out.println("Exited");;
                break;
            default: System.out.println("You select wrong choice");


        }

    }


}
