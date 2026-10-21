package src.math;

public class Programmers_lv0_flag에_따라_다른_값_반환하기 {

    public int solution(int a, int b, boolean flag) {
        if (flag) {
            return a + b;
        }

        return a - b;
    }
}
