import java.util.Arrays;

public class StringReverseProgram {
    public static void main(String[] args) {
        String s ="surya";

        char[] a =s.toCharArray();

        System.out.println("print char array"+ Arrays.toString(a));
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);

        }

    }
}
