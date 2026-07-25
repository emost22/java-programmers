package src.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers_lv0_배열의_원소_삭제하기 {

    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> s = new HashSet<>();
        for (int d : delete_list) {
            s.add(d);
        }

        return Arrays.stream(arr).filter(x -> !s.contains(x)).toArray();
    }
}
