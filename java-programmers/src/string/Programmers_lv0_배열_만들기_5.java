package src.string;

import java.util.ArrayList;

public class Programmers_lv0_배열_만들기_5 {

    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (String str : intStrs) {
            int x = Integer.parseInt(str.substring(s, s + l));
            if (x <= k) {
                continue;
            }

            ret.add(x);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
