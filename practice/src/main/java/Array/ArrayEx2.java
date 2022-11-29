package Array;

public class ArrayEx2 {  // Array copy
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i=0; i < arr.length; i++)
            arr[i] = i + 1;

        System.out.println("Before changing");
        System.out.printf("arr.length: %s%n", arr.length);
        for (int i=0; i < arr.length; i++)
            System.out.printf("arr[%d]: %d%n", i, arr[i]);

        int[] tmp = new int[arr.length * 2];
        for (int i=0; i < arr.length; i++)
            tmp[i] = arr[i];

        arr = tmp;
        System.out.println("After changing");
        System.out.printf("arr.length: %s%n", arr.length);
        for(int i=0; i < arr.length; i++)
            System.out.printf("arr[%d]: %d%n", i, arr[i]);
    }
}
