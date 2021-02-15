package implementation;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL list=new LL();
        while (true) {
            System.out.println("1 for AddFirst");
            System.out.println("2 for AddLast");
            System.out.println("3 for AddBetween");
            System.out.println("4 for DeleteFirst");
            System.out.println("5 for DeleteLast");
            System.out.println("6 for DeleteBetween");
            System.out.println("7 for ViewList");
            System.out.println("Enter Your Choice:");
            int c = sc.nextInt();
            int p,v;
            switch(c){
                case 1:
                    System.out.println("Enter Value:");
                    v= sc.nextInt();
                    list.addFirst(v);
                    break;
                case 2:
                    System.out.println("Enter Value:");
                    v= sc.nextInt();
                    list.addLast(v);
                    break;
                case 3:
                    System.out.println("Enter Position:");
                    p= sc.nextInt();
                    System.out.println("Enter Value:");
                    v= sc.nextInt();
                    list.addBetween(v,p);
                    break;
                case 4:
                    list.deleteFirst();
                    break;
                case 5:
                    list.deleteLast();
                    break;
                case 6:
                    System.out.println("Enter Position:");
                    p= sc.nextInt();
                    list.deleteBetween(p);
                    break;
                case 7:
                    list.viewList();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
