package src.implementation;

import java.util.ArrayList;

public class Programmers_lv0_배열_만들기_1 {

    public int[] solution(int n, int k) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = k; i <= n; i += k) {
            ret.add(i);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
