import java.util.Arrays;
public class print {
    public static void main(String[] args){
        int[] arr={10,20,30,40};
    //toString
        /*String str=Arrays.toString(arr);
        System.out.println(str);

    //copyOf
        int[] brr= Arrays.copyOf( arr,4);
        System.out.println("brr");
        System.out.println(Arrays.toString(brr));
        int[] crr= Arrays.copyOf( arr,2);
        System.out.println("crr");
        System.out.println(Arrays.toString(crr));
        int[] drr= Arrays.copyOf( arr,8);
        System.out.println("drr");
        System.out.println(Arrays.toString(drr));*/

        /*String[] srr={"ravi","ram","sahcin","shyam"};
        String[] krr=Arrays.copyOf(srr,3);
        System.out.println("krr");
        System.out.println(Arrays.toString(krr));*/
    //copyOfRange
        int[] brr=Arrays.copyOfRange(arr,0,4);
        System.out.println("brr");
        System.out.println(Arrays.toString(brr));
        int[] crr=Arrays.copyOfRange(arr,2,2);
        System.out.println("crr");
        System.out.println(Arrays.toString(crr));
        int[] drr=Arrays.copyOfRange(arr,0,8);
        System.out.println("drr");
        System.out.println(Arrays.toString(drr));

    //sort
        int[] xrr={101,290,23,123,34,234,34,45,456};
        System.out.println("Xrr unsorted:");
        System.out.println(Arrays.toString(xrr));
        Arrays.sort(xrr);
        System.out.println("Xrr sorted:");
        System.out.println(Arrays.toString(xrr));

    }
}

