package src.math;

public class Programmers_lv0_피자_나눠_먹기_1 {

    public int solution(int n) {
        return n / 7 + (n % 7 == 0 ? 0 : 1);
    }
}
