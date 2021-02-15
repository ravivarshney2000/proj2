import java.util.Scanner;

public class stringAssg1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String inputString= sc.nextLine();

        System.out.print("index:");
        for (int i = 0; i <inputString.length(); i++) {
            System.out.print(i);
            if (i < inputString.length() - 1)
                System.out.print("\t");
        }
        System.out.println();
        System.out.print("chars:");
        for (int i = 0; i <inputString.length(); i++) {
            System.out.print(inputString.charAt(i));
            if(i<inputString.length()-1)
            System.out.print("\t");

        }

    }
}
