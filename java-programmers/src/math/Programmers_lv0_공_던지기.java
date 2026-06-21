package src.math;

public class Programmers_lv0_공_던지기 {

    public int solution(int[] numbers, int k) {
        return numbers[((k - 1) << 1) % numbers.length];
    }
}
