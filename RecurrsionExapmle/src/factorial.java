public class factorial {
    public static void main(String[] args) {
        System.out.println(fac(5));
    }

    public static long fac(int n){
        if (n==0){
            return 1;
        }

        else {
            return n*fac(n-1);
        }
    }
}
