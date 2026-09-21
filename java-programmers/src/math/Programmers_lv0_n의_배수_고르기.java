package src.math;

import java.util.ArrayList;

public class Programmers_lv0_n의_배수_고르기 {

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int x : numlist) {
            if (x % n != 0) {
                continue;
            }

            ret.add(x);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
