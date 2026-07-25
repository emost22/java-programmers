package src.math;

public class Programmers_lv0_주사위_게임_1 {

    public int solution(int a, int b) {
        if ((a & 1) == 1 && (b & 1) == 1) {
            return a * a + b * b;
        }

        if ((a & 1) == 1 || (b & 1) == 1) {
            return (a + b) << 1;
        }

        return Math.abs(a - b);
    }
}
