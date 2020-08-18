import java.util.ArrayList;
import java.util.Arrays;

public class JavaProgramToReverseArrayList {
    public static void main(String[] args) {
        String s = "surya";

        char[] c = s.toCharArray();

        ArrayList<Character> al2= new ArrayList();

        for(int i =c.length-1;i>=0;i--)
        {
//            al.add(c[i]);
            al2.add(c[i]);

        }
        System.out.println("final result"+al2);

    }
}
