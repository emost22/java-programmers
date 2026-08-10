package src.math;

import java.util.Arrays;

public class Programmers_lv0_조건에_맞게_수열_변환하기_2 {

    public int solution(int[] arr) {
        int[] now = Arrays.copyOf(arr, arr.length);
        int[] pre = Arrays.copyOf(arr, arr.length);
        for (int t = 1; ; t++) {
            for (int i = 0; i < now.length; i++) {
                if (now[i] >= 50 && (now[i] & 1) == 0) {
                    now[i] >>= 1;
                } else if (now[i] < 50 && (now[i] & 1) == 1) {
                    now[i] = (now[i] << 1) + 1;
                }
            }

            boolean flag = true;
            for (int i = 0; i < now.length; i++) {
                if (now[i] != pre[i]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return t - 1;
            }

            pre = Arrays.copyOf(now, now.length);
        }
    }
}
