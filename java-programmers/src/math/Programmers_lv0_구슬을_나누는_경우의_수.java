package src.math;

public class Programmers_lv0_구슬을_나누는_경우의_수 {

    public int solution(int balls, int share) {
        long answer = 1;

        for (int i = 1; i <= share; i++) {
            answer *= (balls - i + 1);
            answer /= i;
        }

        return (int) answer;
    }
}
