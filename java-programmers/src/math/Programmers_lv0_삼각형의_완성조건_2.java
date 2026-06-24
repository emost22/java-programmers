package src.math;

import java.util.Arrays;

public class Programmers_lv0_삼각형의_완성조건_2 {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        int answer = 0;
        for (int i = 1; ; i++) {
            if (i > sides[1]) {
                if (i >= sides[0] + sides[1]) {
                    break;
                }

                answer++;
            } else {
                if (sides[1] >= sides[0] + i) {
                    continue;
                }

                answer++;
            }
        }

        return answer;
    }
}
