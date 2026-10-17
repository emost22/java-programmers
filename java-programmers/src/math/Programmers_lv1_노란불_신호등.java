package src.math;

public class Programmers_lv1_노란불_신호등 {

    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    private int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    public int solution(int[][] signals) {
        int[] ranges = new int[signals.length];
        int l = 1;
        for (int i = 0; i < signals.length; i++) {
            ranges[i] = signals[i][0] + signals[i][1] + signals[i][2];
            l = lcm(l, ranges[i]);
        }

        for (int i = 1; i <= l; i++) {
            int cnt = 0;
            for (int j = 0; j < signals.length; j++) {
                if (signals[j][0] >= i % ranges[j]
                    || i % ranges[j] > signals[j][0] + signals[j][1]) {
                    break;
                }

                cnt++;
            }

            if (cnt == signals.length) {
                return i;
            }
        }

        return -1;
    }
}
