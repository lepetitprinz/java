package dynamicprogramming;

import java.util.*;

public class No15624 {
    static int n;
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
             result = dp(n);
        }
        System.out.println(result);
    }

    private static int dp(int n) {
        int before = 0;
        int next = 1;

        int temp;
        for (int i=0; i < n - 1; i++) {
            temp = next;
            next += before;
            next = next % 1000000007;
            before = temp % 1000000007;
        }

        return next;
    }
}
