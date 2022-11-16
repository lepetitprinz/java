package operator;

public class OperatorEx4 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.println(str1.equals("abc"));
        System.out.println(str2.equals("abc"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase("ABC"));
    }
}
