package Operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        int k = 0;
        k++;
        System.out.println(k);

        int i = 5, j = 0;
        j = i++;
        System.out.println("i=" + i + ", j=" + j);

        i = 5;
        j = 0;
        j = ++i;
        System.out.println("i=" + i + ", j=" + j);

        i = 5;
        j = 5;
        System.out.println(i++);
        System.out.println(++j);
        System.out.println("i=" + i + ", j=" + j);
    }
}
