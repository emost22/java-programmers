package src.math;

import java.util.ArrayList;
import java.util.Comparator;

public class Programmers_lv0_전국_대회_선발_고사 {

    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        ArrayList<int[]> list = new ArrayList<>();
        int N = rank.length;
        for (int i = 0; i < N; i++) {
            if (!attendance[i]) {
                continue;
            }

            list.add(new int[]{i, rank[i]});
        }

        list.sort(Comparator.comparingInt(o -> o[1]));
        answer = list.get(0)[0] * 10000 + list.get(1)[0] * 100 + list.get(2)[0];

        return answer;
    }
}
