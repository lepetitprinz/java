package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No20047 {

    static int n;
    static int[] data;
    static int[] pairs;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        data = new int[n * 2];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i < data.length; i++) {
            data[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(data);

        pairs = new int[n];
        for (int i=0; i < n; i++) {
            pairs[i] = data[i] + data[n * 2 - i - 1];
        }

        int result = Arrays.stream(pairs).min().getAsInt();
        System.out.println(result);


    }
}
