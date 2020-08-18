package inheritance;

public class SwappingWithThirdVariable {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("printing the a value before swapping "+a);
        System.out.println("printing the b value before swapping "+b);

        temp=a;
        a=b;
        System.out.println("printing the a "+a);
        System.out.println("printing the b "+b);
        b=temp;


        System.out.println("printing the a value after swapping "+a);
        System.out.println("printing the b value after swapping "+b);
    }
}
