package src.implementation;

import java.util.ArrayList;

public class Programmers_lv0_배열_만들기_6 {

    public int[] solution(int[] arr) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (ret.isEmpty()) {
                ret.add(arr[i]);
                continue;
            }

            if (ret.get(ret.size() - 1) == arr[i]) {
                ret.remove(ret.size() - 1);
            } else {
                ret.add(arr[i]);
            }
        }

        if (ret.isEmpty()) {
            ret.add(-1);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
