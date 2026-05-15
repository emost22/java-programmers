package src.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_lv0_등수_매기기 {

    public int[] solution(int[][] score) {
        int[] answer = {};

        int[][] list = new int[score.length][3];
        for (int i = 0; i < score.length; i++) {
            list[i][0] = (score[i][0] + score[i][1]);
            list[i][1] = i;
        }

        Arrays.sort(list, (o1, o2) -> o2[0] - o1[0]);

        list[0][2] = 1;
        for (int i = 1; i < list.length; i++) {
            if (list[i][0] == list[i - 1][0]) {
                list[i][2] = list[i - 1][2];
            } else {
                list[i][2] = i + 1;
            }
        }

        Arrays.sort(list, Comparator.comparingInt(o -> o[1]));
        answer = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            answer[i] = list[i][2];
        }

        return answer;
    }
}
