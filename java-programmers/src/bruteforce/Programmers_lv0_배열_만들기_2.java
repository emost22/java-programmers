package src.bruteforce;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_lv0_배열_만들기_2 {

    private static void func(ArrayList<Integer> list, int now, int l, int r) {
        if (now > r) {
            return;
        }

        if (l <= now) {
            list.add(now);
        }

        if (now != 0) {
            func(list, now * 10, l, r);
        }
        func(list, now * 10 + 5, l, r);
    }

    public static int[] solution(int l, int r) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        func(list, 0, l, r);
        Collections.sort(list);
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if (answer.length == 0) {
            answer = new int[]{-1};
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] ret = solution(1, 1);
        for (int x : ret) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
