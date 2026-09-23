package src.math;

public class Programmers_lv0_제곱수_판별하기 {

    public int solution(int n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n ? 1 : 2;
    }
}
