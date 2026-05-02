package src.dp;

public class Programmers_lv0_겹치는_선분의_길이 {

    private final int MAX = 210;

    public int solution(int[][] lines) {
        int answer = 0;

        int dp[] = new int[MAX];
        for (int[] a : lines) {
            dp[a[0] + 101]++;
            dp[a[1] + 101]--;
        }

        for (int i = 1; i < MAX; i++) {
            dp[i] += dp[i - 1];
            if (dp[i] >= 2) {
                answer++;
            }
        }

        return answer;
    }
}
