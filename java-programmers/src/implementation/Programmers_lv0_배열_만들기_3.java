package src.implementation;

import java.util.ArrayList;

public class Programmers_lv0_배열_만들기_3 {

    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int[] q : intervals) {
            for (int i = q[0]; i <= q[1]; i++) {
                ret.add(arr[i]);
            }
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
