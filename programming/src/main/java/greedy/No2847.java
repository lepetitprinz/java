package greedy;

import java.util.*;

public class No2847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int value = arr[n - 1];
        int cnt = 0;

        for (int i=n-2; i >= 0; i--) {
            if (arr[i] >= value) {
                cnt += arr[i] - value + 1;
                value -= 1;
            }
            else {
                value = arr[i];
            }
        }

        System.out.println(cnt);
    }
}
