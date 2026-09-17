package src.math;

import java.util.ArrayList;

public class Programmers_lv0_약수_구하기 {

    public int[] solution(int n) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i != 0) {
                continue;
            }

            ret.add(i);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
