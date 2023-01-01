package implementation;

import java.util.*;

public class No2563 {
    static int n;
    static int sum;
    static int[][] arr = new int[100][100];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // System.out.println("x :" + x + ", y: " + y);
            arr = solve(arr, x, y);
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
    private static int[][] solve(int[][]arr, int x, int y) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[x + i - 1][y + j - 1] = 1;
            }
        }
        return arr;
    }
}

