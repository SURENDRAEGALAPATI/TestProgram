package inheritance;

public class GreatestNumberFinder {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;
        int c = 20;

        if (a > b && a > c) {
            System.out.println("printing the greatest value " + a);
        }
        if (b > a && b > c) {
            System.out.println("printing the greatest value " + b);
        }
        if (c > a && c > b) {
            System.out.println("printing the greatest value " + c);
        }
        if (a == b && a == c) {
            System.out.println("all the values are same");
        } else if (a == b || b == c || c == a) {
            System.out.println("some of the two values are same");
        }

    }
}
