package exceptionhandling;

public class Throw {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("Indented execution");
            throw e;
        } catch (Exception e) {
            System.out.println("Error Message: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("program is finished");
    }
}
