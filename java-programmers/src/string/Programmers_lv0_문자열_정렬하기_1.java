package src.string;

import java.util.ArrayList;

public class Programmers_lv0_문자열_정렬하기_1 {

    public int[] solution(String my_string) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (char x : my_string.toCharArray()) {
            if (x < '0' || '9' < x) {
                continue;
            }

            ret.add(x - '0');
        }

        return ret.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
