public class fabbiconi {
    static int n1=0,n2=1,n3;
    public static void main(String[] args) {
        int count=10;
        if (count >= 2) {
            System.out.print(n1 + " " + n2);
            fab(count - 2);
        }
    }

    public static int fab(int a){


            if (a>0){

                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(" "+n3);
                fab(a-1);
            }
            return 0;
    }
}
