package src.math;

import java.util.Arrays;

public class Programmers_lv0_주사위_게임_3 {

    private int getScore(int[] a) {
        if (a[0] == a[3]) {
            return 1111 * a[0];
        }

        if (a[0] == a[2]) {
            return (10 * a[0] + a[3]) * (10 * a[0] + a[3]);
        }

        if (a[1] == a[3]) {
            return (10 * a[1] + a[0]) * (10 * a[1] + a[0]);
        }

        if (a[0] == a[1] && a[2] == a[3]) {
            return (a[0] + a[2]) * Math.abs(a[0] - a[2]);
        }

        if (a[0] == a[1]) {
            return a[2] * a[3];
        }

        if (a[1] == a[2]) {
            return a[0] * a[3];
        }

        if (a[2] == a[3]) {
            return a[0] * a[1];
        }

        return a[0];
    }
    
    public int solution(int a, int b, int c, int d) {
        int[] tmp = new int[]{a, b, c, d};
        Arrays.sort(tmp);

        return getScore(tmp);
    }
}
