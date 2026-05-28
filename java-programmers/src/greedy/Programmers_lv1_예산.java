package src.greedy;

import java.util.Arrays;

public class Programmers_lv1_예산 {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int x : d) {
            if (budget < x) {
                break;
            }

            budget -= x;
            answer++;
        }

        return answer;
    }
}
