import java.util.Scanner;

public class sortingString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        int n = 0;
        String tem;
        //entering total no. of names
        System.out.print("Enter NUmber of names:");
        n=sc.nextInt();
        String name[] =new String[n];
        //enetering names
        System.out.println("enter "+n+"names:");
        for (int i = 0; i < n; i++)
        {
            name[i]=s.nextLine();
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 1+i; j < n; j++)
            {
              if (name[i].compareTo(name[j])>0)
              {
                  tem=name[i];
                  name[i]=name[j];
                  name[j]=tem;
              }
            }
            for (int k = 0; k < n; k++)
            {
                System.out.print(name[k]+",");
            }
            System.out.println();
        }

        System.out.println("sorted names:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(name[i]+",");
        }

    }
}
