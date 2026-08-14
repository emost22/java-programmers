package src.numberTheory;

public class Programmers_lv0_피자_나눠_먹기_2 {

    private int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    private int lcm(int x, int y) {
        return x * y / gcd(x, y);
    }

    public int solution(int n) {
        return lcm(6, n) / 6;
    }
}
