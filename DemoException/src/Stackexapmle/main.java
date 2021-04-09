package Stackexapmle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws MyExp {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        if (sum<150)
        {
            throw new MyExp("custom exception occurred");
        }
        else
            System.out.println("sum :"+sum);
    }
}
