package inheritance;

import java.util.ArrayList;

public class StringsCounter {
    public static void main(String[] args) {
        String s = "QA Automation task for Check for in window-ness for odol showings as well in all Lite jobs";
        char[] c = s.trim().toCharArray();

        System.out.println("printing the characters length "+c.length);
        System.out.println("printing the characters s "+s);

int wordCount = s.split(" ").length;

        System.out.println("printing the wordCount "+wordCount);

        ArrayList<String> al = new ArrayList<String>();
        for(int i=0;i<s.split(" ").length;i++)
        {
           String[] sta = s.split(" ");
            System.out.println(sta[i]);
        }

    }
}
