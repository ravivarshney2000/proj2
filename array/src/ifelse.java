import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("ENTER FULL NAME");
        String name = object.nextLine();
        if (name.equals("ravi"))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
