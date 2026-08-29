package src.math;

import java.util.ArrayList;

public class Programmers_lv0_콜라츠_수열_만들기 {

    public int[] solution(int n) {
        ArrayList<Integer> ret = new ArrayList<>();

        ret.add(n);
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>= 1;
            } else {
                n = n * 3 + 1;
            }

            ret.add(n);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
