package src.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Programmers_lv0_무작위로_K개의_수_뽑기 {

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);

        Set<Integer> s = new HashSet<>();
        int idx = 0;
        for (int x : arr) {
            if (idx == k) {
                break;
            }

            if (s.contains(x)) {
                continue;
            }

            answer[idx++] = x;
            s.add(x);
        }

        return answer;
    }
}
