import java.util.Scanner;
public class DemoScanner {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("ENTER FULL NAME");
        String name = object.nextLine();
        System.out.println("ENTER AGE");
        byte age = object.nextByte();
        System.out.println("ENTER 4 DIGIT CODE");
        short code = object.nextShort();
        System.out.println("ENTER CPI");
        double cpi=object.nextDouble();
        System.out.println("ENTER MOBILE NUMBER");
        long mobile=object.nextLong();
        System.out.println("ENTER EXAM STATUS TRUE FOR PASS/FALSE FOR FAIL");
        boolean passed=object.nextBoolean();
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("4-digit code:"+ code);
        System.out.println("Cpi:"+ cpi);
        System.out.println("Mobile Number:"+ mobile);
        System.out.println("Status:"+ passed);
    }
}
