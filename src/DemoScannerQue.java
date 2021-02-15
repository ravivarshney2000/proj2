import java.util.Scanner;
public class DemoScannerQue {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("ENTER FIRST NAME");
        String firstName=object.nextLine();
        System.out.println("ENTER YOUR ROLLNUMBER");
        int rollNumber=object.nextInt();
        System.out.println("ENTER YOUR PERCENTAGE");
        double percentage=object.nextDouble();
        System.out.println("ENTER YOUR SECTION");
        String section=object.next();
        System.out.println("ENTER YOUR COURSE YEAR");
        int year=object.nextInt();
        object.nextLine();
        System.out.println("ENTER YOUR COURSE");
        String course=object.nextLine();
        System.out.println("FIRST NAME:"+ firstName);
        System.out.println("ROLLNUMBER:"+ rollNumber);
        System.out.println("PERCENTAGE:"+ percentage);
        System.out.println("SECTION:"+ section);
        System.out.println("YEAR:"+ year);
        System.out.println("COURSE:"+ course);



    }
}
