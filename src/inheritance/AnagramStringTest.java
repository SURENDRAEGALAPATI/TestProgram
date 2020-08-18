package inheritance;

public class AnagramStringTest {

    public static void main(String[] args) {
        String s1 ="surya";
        String s2 ="surye";

        String[] s1Chunks = s1.split("");
        String[] s2Chunks = s2.split("");

//        for (int i=0;i<s2Chunks.length;i++)
//        {
//            if(!s2.contains(s1Chunks[i]))
//            {
//                System.out.println("Given Strings are not ANAGRAM");
//                break;
//            }
//
//
//        }

        if(s1.length()==s2.length()){
        for (String s:s1Chunks
             ) {
            if(!s2.contains(s))
            {
                System.out.println("NOT GOOD STRING");
            }
        }
    }
        else
        {
            System.out.println("LENGTHS are not equal");
        }
}}
