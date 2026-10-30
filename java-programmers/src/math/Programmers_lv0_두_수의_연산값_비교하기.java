package src.math;

public class Programmers_lv0_두_수의_연산값_비교하기 {

    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), a * b << 1);
    }
}
