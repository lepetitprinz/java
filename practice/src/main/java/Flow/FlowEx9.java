package Flow;

public class FlowEx9 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum1 = 0;
        int sum2 = 0;

        for (int i=0; i<arr.length; i++) {
            sum1 += arr[i];
        }

        for (int tmp : arr) {
            sum2 += tmp;
        }

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
