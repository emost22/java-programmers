package src.math;

public class Programmers_lv0_점의_위치_구하기 {

    public int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) {
            return 1;
        }
        if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        }
        if (dot[0] < 0 && dot[1] > 0) {
            return 2;
        }

        return 3;
    }
}
