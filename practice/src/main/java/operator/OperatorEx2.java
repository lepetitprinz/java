package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i=0; i<26; i++) {
            System.out.print(c++);
        }
        System.out.println();
        c = 'A';
        for (int i=0; i<26; i++) {
            System.out.print(c++);
        }
        System.out.println();
    }
}
