package Exception_Handaling;

public class FinallyEx {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
    

}
