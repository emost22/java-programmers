package src.math;

public class Programmers_lv0_더_크게_합치기 {

    public int solution(int a, int b) {
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        return Math.max(Integer.parseInt(sa + sb), Integer.parseInt(sb + sa));
    }
}
