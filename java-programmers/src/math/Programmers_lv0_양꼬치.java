package src.math;

public class Programmers_lv0_양꼬치 {

    private final int SHEEP = 12000;
    private final int DRINK = 2000;

    public int solution(int n, int k) {
        return n * SHEEP + (k - n / 10) * DRINK;
    }
}
