package src.implementation;

import java.util.Arrays;

public class Programmers_lv0_수열과_구간_쿼리_2 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        Arrays.fill(answer, Integer.MAX_VALUE);

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] <= queries[i][2]) {
                    continue;
                }

                answer[i] = Math.min(answer[i], arr[j]);
            }

            if (answer[i] == Integer.MAX_VALUE) {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
