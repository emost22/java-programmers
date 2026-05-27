package src.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Programmers_lv1_같은_숫자는_싫어 {

    public int[] solution(int[] arr) {
        int[] answer = {};

        Deque<Integer> dq = new ArrayDeque<>();
        for (int x : arr) {
            if (dq.isEmpty()) {
                dq.addLast(x);
                continue;
            }

            if (dq.peekLast() == x) {
                continue;
            }

            dq.addLast(x);
        }

        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}
