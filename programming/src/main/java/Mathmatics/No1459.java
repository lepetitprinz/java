package Mathmatics;

import java.util.*;

public class No1459 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long w = scanner.nextInt();
        long s = scanner.nextInt();

        long path1 = (x + y) * w;
        long path2 = Math.min(x, y) * s + Math.abs(x - y) * w;
        long path3;
        if ((x + y) % 2 == 0) {
            path3 = Math.max(x, y) * s;
        }
        else {
            path3 = (Math.max(x, y) - 1) * s + w;
        }
        long[] resultArr = new long[] {path1, path2, path3};
        long result = Arrays.stream(resultArr).min().getAsLong();
        System.out.println(result);
    }
}
