package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No2865 {
    static int n, m, k;
    static Map<Integer, Double> scores = new HashMap<Integer, Double>();
    static List<Double> max_scores;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        for (int i=0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j < n; j++) {
                int p = Integer.parseInt(st.nextToken());
                double score = Double.parseDouble(st.nextToken());

                if (i == 0) {
                    scores.put(p, score);
                }
                else {
                    double max_score = scores.get(p);
                    if (score > max_score) {
                        scores.put(p, score);
                    }
                }
            }
        }

        max_scores = new ArrayList<>(scores.values());
        max_scores.sort(Collections.reverseOrder());
        List<Double> result_scores = max_scores.subList(0, k);
        double result = result_scores.stream().mapToDouble(Double::doubleValue).sum();

        System.out.printf("%.1f%n", result);
    }
}
