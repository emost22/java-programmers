package src.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Programmers_lv0_배열_만들기_4 {

    public int[] solution(int[] arr) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int x : arr) {
            while (!dq.isEmpty() && dq.peekLast() >= x) {
                dq.pollLast();
            }

            dq.addLast(x);
        }

        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}
