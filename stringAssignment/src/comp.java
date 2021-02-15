import java.util.Scanner;

public class comp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER STRING 1:");
        String s1=sc.nextLine();
        System.out.print("ENTER STRING 2:");
        String s2=sc.nextLine();
        int a=s1.compareTo(s2);
        System.out.println(a);
    }
}
