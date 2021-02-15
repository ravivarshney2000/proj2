import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER STRING 1:");
        String s1=sc.nextLine();
        System.out.print("ENTER STRING 2:");
        String s2=sc.nextLine();
        //making new string of char array
        char[] temp1=s1.toCharArray();
        Arrays.sort(temp1);
    //making new string of char array
        String s3=new String(temp1);


        //making new string of char array
        char[] temp2=s2.toCharArray();
        Arrays.sort(temp2);
        //making new string of char array
        String s4=new String(temp2);

        System.out.println("sorted s1="+ s3);
        System.out.println("sorted s4="+ s4);
        if (s3.equals(s4)){
            System.out.println("Anagram");
        }
        else
            System.out.println("Not Anagram");
    }
}
