package inheritance;

import java.nio.file.Files;

public class StringReplacement {
    public static void main(String[] args) {
//        String result =null;
//        String s = "Many novice writers tend to make a sharp distinction between content and style, thinking that a paper can be strong in one and weak in the other, but focusing on organization shows how content and style converge in deliberative academic writing. Your professors/ will view even the most elegant prose as rambling/ and tedious if there isn’t a careful, coherent argument to give the text meaning. Paragraphs are the “stuff ” of academic writing and, /thus, worth our/ attention here";
//        char[] c = s.toCharArray();
//        System.out.println("printing the last Index "+s.lastIndexOf("/"));
//
//        String temp = s.substring(0, s.lastIndexOf("/")) + "" + s.substring(s.lastIndexOf("/") + 1);
//
//        System.out.println("printing the first arguement"+s.substring(0, s.lastIndexOf("/")));
//        System.out.println("printing the second arguement "+s.substring(s.lastIndexOf("/") - s.indexOf("/")));
//
//        System.out.println("printing the final result"+temp);


        String s = "This is my first string complicated program";
        String checkedString = "";
        String duplicates = "";

        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {

            String current = Character.toString(c[i]);

            if(checkedString.contains(current))
            {
                if(!duplicates.contains(current))
                duplicates =c[i]+",".trim();
            }

            checkedString += c[i];
        }


        System.out.println("printing the duplicates  " + duplicates);
    }
}
