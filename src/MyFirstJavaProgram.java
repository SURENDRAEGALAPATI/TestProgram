import java.util.Scanner;

public class MyFirstJavaProgram {
    public static void main(String[] args) {
        int i = 0;

        while (i < 3) {
            try {
                calculator();
                break;
            }
            catch (Exception e)
            {
                System.out.println("println"+e);
            }
        }



    }
        private static  void calculator(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input 1:--");
        Integer number1 = input.nextInt();
        System.out.println("Enter the input 2:--");
        Integer number2 = input.nextInt();

        System.out.println("Entered Numbers are "+number1+ " "+number2);

        System.out.println("addition of two numbers is "+number1+number2);
        System.out.println("subtraction of two numbers is "+(number1 - number2));
        System.out.println("multiplication of two numbers is "+(number1 * number2));
        System.out.println("divisions of two numbers is "+(number1/number2));

    }

    }

