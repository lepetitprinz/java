package exceptionhandling;

public class ExceptionEx2 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception handling at method 1");
            e.printStackTrace();
        }
    }
}
