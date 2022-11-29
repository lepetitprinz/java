package Sorting;

import java.util.*;

public class No10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i=0; i < n; i++) {
            hashSet.add(sc.nextInt());
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
        Collections.sort(arrayList);

        StringBuilder sb = new StringBuilder();
        for (int i: arrayList) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
