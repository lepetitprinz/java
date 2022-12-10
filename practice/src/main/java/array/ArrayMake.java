package array;

import java.util.Arrays;

public class ArrayMake {
    public static void main(String[] args) {
        int [] score = new int[5];
        int tmp = 50;

        for (int i=0; i < 5; i++) {
            score[i] = tmp;
            tmp += 10;
        }

        for(int i=0; i < 5; i++) {
            System.out.println(score[i]);
        }

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1));

        char[] arr2 = {'a', 'b', 'c'};
        System.out.println(arr2);
    }
}
