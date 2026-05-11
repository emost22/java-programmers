package src.math;

public class Programmers_lv0_유한소수_판별하기 {

    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    public int solution(int a, int b) {
        int answer = 0;

        int g = gcd(a, b);
        int x = b / g;

        while ((x & 1) == 0) {
            x >>= 1;
        }

        while (x % 5 == 0) {
            x /= 5;
        }

        if (x == 1) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
