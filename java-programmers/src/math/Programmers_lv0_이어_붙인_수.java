package src.math;

public class Programmers_lv0_이어_붙인_수 {

    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int x : num_list) {
            if ((x & 1) == 0) {
                even = even * 10 + x;
            } else {
                odd = odd * 10 + x;
            }
        }

        return odd + even;
    }
}
