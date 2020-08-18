public class ExceptionHandlingTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        try {
            int c = 1 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("printing the final method");
        }
    }
}