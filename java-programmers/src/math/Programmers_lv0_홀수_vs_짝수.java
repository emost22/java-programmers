package src.math;

public class Programmers_lv0_홀수_vs_짝수 {

    public int solution(int[] num_list) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < num_list.length; i++) {
            if ((i & 1) == 0) {
                b += num_list[i];
            } else {
                a += num_list[i];
            }
        }

        return Math.max(a, b);
    }
}
