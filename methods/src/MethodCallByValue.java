public class MethodCallByValue {
    public static void main(String[] args)
    {
        int a=10;
        int b=15;
        MethodCallByValue obj=new MethodCallByValue();
        System.out.println(obj.add(a,b));
        System.out.println(a);
        System.out.println(b);
    }
    public int add(int a,int b)
    {
        int r=a+b;
        return r;
    }
}
