package inheritance;

public class SwappingWithOutThirdVariable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("printing the a value before swapping "+a);
        System.out.println("printing the b value before swapping "+b);

a=a+b;
b=a-b;
a=a-b;



        System.out.println("printing the a value after swapping "+a);
        System.out.println("printing the b value after swapping "+b);
    }
}
