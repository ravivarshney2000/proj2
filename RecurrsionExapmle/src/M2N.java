public class M2N {
    public static void main(String[] args) {
        System.out.println(mul(5,6));
    }

    public static int mul(int a,int b){
        if(b==0){
            return 0;
        }

        else {
            return a + mul(a,b-1);
        }
    }
}
