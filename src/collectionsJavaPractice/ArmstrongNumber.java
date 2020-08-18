package collectionsJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {

    ArrayList<Integer> cubedNumbers = new ArrayList<>();
    ArrayList<Integer> numberChunks = new ArrayList<>();

    int sum=0;

    public String TakeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the i/p ");
        String input = sc.nextLine();

        return input;
    }

    public  int cubeTheInput() {

        String[] inputNumberChunks = TakeInput().split("");
        for (String s : inputNumberChunks
        ) {

            numberChunks.add(Integer.parseInt(s));

        }

        System.out.println("printing the numberChunks " + numberChunks);

        for (Integer digit : numberChunks
        ) {
            cubedNumbers.add(digit * digit * digit);
        }


        System.out.println("cubed and added to the list " + cubedNumbers);
        for (int element:cubedNumbers
             ) {
            sum+=element;
        }
        System.out.println("sum "+sum);

        return sum;
    }

    public void niceNumberDecider()
    {
        if(Integer.parseInt(TakeInput())==cubeTheInput())
        {
            System.out.println("This is NICE number");
        }
        else
        {

            System.out.println("This is NOT NICE NUMBER ---->:(");
        }
    }

    public static void main(String[] args) {

        ArmstrongNumber ams = new ArmstrongNumber();

//        System.out.println("input enetered is "+ams.TakeInput());


        ams.niceNumberDecider();
    }


}
