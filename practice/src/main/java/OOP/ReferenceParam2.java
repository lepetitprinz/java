package OOP;

import java.util.*;

public class ReferenceParam2 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("Sum of values: " + sumArr(arr));
    }

    static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println();
    }

    static int sumArr(int[] arr) {
        int sumVal = 0;
        for (int i : arr) {
            sumVal += i;
        }
        return sumVal;
    }

    static void sortArr(int[] arr) {
        Arrays.sort(arr);
        }
}

