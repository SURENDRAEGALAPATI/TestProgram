package inheritance;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
        char[] c = s.toCharArray();


       int lgt = c.length;
       char[] reversedCharArray ;

        System.out.println("printing the lgt"+lgt);

       for(int i=lgt-1;i<lgt;i--)
       {

           System.out.print(c[i]);


           if(i==0)
               break;;

       }

    }

}
