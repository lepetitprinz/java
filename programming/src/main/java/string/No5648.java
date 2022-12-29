package string;

import java.io.IOException;
import java.util.*;

public class No5648 {
    static int n;
    static Long[] arr;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new Long[n];

        for (int i=0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(sc.nextLong());
            sb.reverse();
            arr[i] = Long.parseLong(sb.toString());
        }

        Arrays.sort(arr, 0, n);

        for (Long num: arr) {
            System.out.println(num);
        }
    }
}
