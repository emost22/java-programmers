package src.math;

import java.util.Arrays;

public class Programmers_lv0_배열의_길이에_따라_다른_연산하기 {

    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        int idx = (arr.length & 1) == 0 ? 1 : 0;
        while (idx < arr.length) {
            answer[idx] += n;
            idx += 2;
        }

        return answer;
    }
}
