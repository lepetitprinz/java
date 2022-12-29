package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No15828 {
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            if (number == -1) break;
            if (number == 0) {
                queue.remove();
            } else if (queue.size() < n) {
                queue.add(number);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i: queue) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
