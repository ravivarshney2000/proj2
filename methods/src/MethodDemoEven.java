import java.util.Scanner;

public class MethodDemoEven
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num1=sc.nextInt();
        MethodDemoEven object =new MethodDemoEven();
        boolean result=object.isEven(num1);
        System.out.println("The Given Number Is Even="+result);
    }
    public boolean isEven(int a)
    {
        boolean response =false;
        if(a%2==0)
        {
            response=true;
        }
        return response;
    }
}
