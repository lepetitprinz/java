package bfs;

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


    }
}
