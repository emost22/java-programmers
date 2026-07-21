package src.math;

public class Programmers_lv0_369게임 {

    private int getClap(int x) {
        int ret = 0;
        while (x > 0) {
            int r = x % 10;
            if (r == 3 || r == 6 || r == 9) {
                ret++;
            }

            x /= 10;
        }

        return ret;
    }

    public int solution(int order) {
        return getClap(order);
    }
}
