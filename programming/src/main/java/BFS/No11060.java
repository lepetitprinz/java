package BFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No11060 {

    static int n;
    static int[] data;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());

        data = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i < n; i++) {
            data[i] = Integer.parseInt(st.nextToken());
            visited[i] = false;
        }

    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        visited[0] = true;

        while(!queue.isEmpty()) {
            Point p = queue.poll();
            if (p.x == 0)

            }

        }

    }
}
