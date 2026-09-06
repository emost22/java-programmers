package src.math;

public class Programmers_lv0_피자_나눠_먹기_3 {

    public int solution(int slice, int n) {
        return n / slice + (n % slice != 0 ? 1 : 0);
    }
}
