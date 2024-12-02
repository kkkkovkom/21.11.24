package MyPackage;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2.0 / 0.0); // Код, который может вызвать исключение
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 exception = new Exception1();
        exception.exceptionDemo();
    }
}