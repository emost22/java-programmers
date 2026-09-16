package src.math;

import java.util.Arrays;

public class Programmers_lv0_삼각형의_완성조건_1 {

    public int solution(int[] sides) {
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            return 1;
        }
        
        return 2;
    }
}
