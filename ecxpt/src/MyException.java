import java.util.Scanner;

class JavaException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        try{
            if(a == 0)
            throw new MyException(0);
        }
        catch(MyException e){
            System.out.println(e) ;
        }
    }
}

class MyException extends Exception{
    int a;
    MyException(int b) {

        a=b;
    }
    public String toString(){
        return ("Exception Number =  "+a) ;
    }
}