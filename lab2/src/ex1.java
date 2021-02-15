public class ex1 {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        ex1 obj=new ex1();
        boolean result=obj.isSorted(arr);
        if(result){
            System.out.println("sorted");
        }
        else
            System.out.println("unsorted");

    }

    public boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {

            for ( i = 0; i <4; i++)
            {
                if (arr[i]<arr[i+1])
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

}


