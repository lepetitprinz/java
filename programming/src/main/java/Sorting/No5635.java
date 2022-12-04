package Sorting;

import java.util.*;

public class No5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] name = new String[n];
        ArrayList<Integer> day = new ArrayList<>();

        for (int i=0; i < n; i++) {
            name[i] = sc.next();
            int d = sc.nextInt();
            int m = sc.nextInt();
            int y = sc.nextInt();
            day.add((y * 365) + (m * 31) + d);
        }

        int minVal = Collections.min(day);
        int maxVal = Collections.max(day);
        int minIdx = day.indexOf(minVal);
        int maxIdx = day.indexOf(maxVal);

        System.out.println(name[minIdx]);
        System.out.println(name[maxIdx]);
    }
}
