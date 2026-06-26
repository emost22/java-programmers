package src.implementation;

public class Programmers_lv0_수열과_구간_쿼리_4 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] != 0) {
                    continue;
                }

                answer[j]++;
            }
        }

        return answer;
    }
}
