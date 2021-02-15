import java.util.Arrays;

public class MethodCallByRef
{
    public static void main(String[] args)
    {
        int a=10;
        int b=15;
        MethodCallByRef obj=new MethodCallByRef();
        int[] brr={1,2,3,4};

        System.out.println(Arrays.toString(brr));
        System.out.println(obj.add(brr));
        System.out.println(Arrays.toString(brr));
    }
    public int add(int[] arr)
    {
        int r=0;
        for(int i=0;i<arr.length;i++)
        {
            r=r+arr[i];
            arr[i]=0;
        }
        return r;
    }
}
