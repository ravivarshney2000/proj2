import java.util.Scanner;

public class MethodDemoReturn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two integers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        //declaring a variable to store result of function call
        //calling a method add
        int result=add(num1,num2);
        System.out.println("RESULT="+result);
    }
    //declaring and defining add method
    public static int add(int a,int b)
    {
        //return variable called response,
        //that holds results
        int response = 0;
        //task or functionality
        response=a+b;
        //returing result to calling function
        return response;
    }
}
