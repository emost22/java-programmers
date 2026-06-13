package src.math;

import java.util.Arrays;

public class Programmers_lv0_가까운_수 {

    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int mn = Math.abs(answer - n);
        for (int i = 1; i < array.length; i++) {
            if (mn <= Math.abs(array[i] - n)) {
                continue;
            }

            answer = array[i];
            mn = Math.abs(array[i] - n);
        }

        return answer;
    }
}
