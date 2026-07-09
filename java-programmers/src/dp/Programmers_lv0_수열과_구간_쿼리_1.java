package src.dp;

public class Programmers_lv0_수열과_구간_쿼리_1 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        int[] dp = new int[arr.length + 1];
        for (int[] q : queries) {
            dp[q[0]]++;
            dp[q[1] + 1]--;
        }

        for (int i = 1; i < dp.length; i++) {
            dp[i] += dp[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i] + dp[i];
        }

        return answer;
    }
}
