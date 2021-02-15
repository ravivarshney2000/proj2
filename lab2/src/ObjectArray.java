import java.util.Arrays;

public class ObjectArray {
    public static void main(String[] args) {

        Student[] arr = new Student[3];
        System.out.println(Arrays.toString(arr));

        Student s1=new Student();
        s1.setName("ravi");
        s1.setRollNo(1);

        Student s2=new Student();
        s2.setName("sachin");
        s2.setRollNo(2);

        Student s3=new Student();
        s3.setName("pawan");
        s3.setRollNo(3);

        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
