import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {


    public static void main(String[] args) {

        enterHashMapValuesFromConsole();
    }

    private static void enterHashMapValuesFromConsole()
    {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("iphone 11",1100);
        hm.put("iphone 12",1200);
        hm.put("iphone 13",1300);
        hm.put("iphone 14",1400);

        for(int i=0;i<5;i++) {

            System.out.println("printing the new hashmap before adding new values" + hm);

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the phone name");
            String keyName = sc.nextLine();
            System.out.println("enter the phone price");
            int price = sc.nextInt();

            System.out.println("adding the values to the hashmap");

            System.out.println("printing the new hashmap after adding new values" + hm);
        }
    }


}
