package src.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Programmers_lv0_배열_조각하기 {

    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            dq.addLast(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            if ((i & 1) == 0) {
                int cnt = dq.size() - query[i] - 1;
                while (cnt-- > 0) {
                    dq.pollLast();
                }
            } else {
                int cnt = query[i];
                while (cnt-- > 0) {
                    dq.pollFirst();
                }
            }
        }

        answer = dq.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
