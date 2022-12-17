package exceptionhandling;

import static java.lang.Math.random;

public class ExceptionEx {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i=0; i < 10; i++) {
            try {
                result = number / (int) (random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");
            }
        }
    }
}
