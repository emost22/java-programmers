package src.math;

import java.util.HashSet;
import java.util.Set;

public class Programmers_lv1_폰켓몬 {

    public int solution(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int x : nums) {
            s.add(x);
        }

        int cnt = nums.length >> 1;
        int size = s.size();
        if (size <= cnt) {
            return size;
        }

        return cnt;
    }
}
