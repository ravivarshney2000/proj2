import java.util.Arrays;

public class a1 {
    public static void main(String[] args) {
        String s="abcd";
        char[] a=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i]=s.charAt(i);

        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

        }
    }
