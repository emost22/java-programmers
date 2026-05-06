package src.math;

import java.util.ArrayList;

public class Programmers_lv0_연속된_수의_합 {

    public int[] solution(int num, int total) {
        int l = 1;
        int r = num;
        int sum = num * (num + 1) >> 1;
        while (sum != total) {
            if (sum > total) {
                sum -= r;
                l--;
                r--;
                sum += l;
            } else {
                sum -= l;
                l++;
                r++;
                sum += r;
            }
        }

        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            ret.add(i);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
