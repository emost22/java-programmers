package src.math;

public class Programmers_lv0_분수의_덧셈 {

    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    private int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};

        int b = lcm(denom1, denom2);
        int a = numer1 * (b / denom1) + numer2 * (b / denom2);
        int g = gcd(a, b);
        answer = new int[]{a / g, b / g};

        return answer;
    }
}
