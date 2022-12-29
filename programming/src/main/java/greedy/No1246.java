package greedy;

import java.io.IOException;
import java.util.*;

public class No1246 {
    static int n, m;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];

        for (int i=0; i < m; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int max_price = 0;
        int max_sales = 0;

        for (int i=0; i < m; i++) {
            int sales = arr[i] * Math.min(n, m - i);
            if (sales > max_sales) {
                max_price = arr[i];
                max_sales = sales;
            }
        }

        System.out.printf("%d %d", max_price, max_sales);
    }
}
