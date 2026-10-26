package src.implementation;

import java.util.HashMap;
import java.util.Map;

public class Programmers_lv1_가장_많이_받은_선물 {

    private Map<String, Integer> m = new HashMap<>();

    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int cnt = 0;
        for (String name : friends) {
            m.put(name, cnt++);
        }

        int[][] list = new int[cnt][cnt];
        int[] sum = new int[cnt];
        for (String info : gifts) {
            String[] tmp = info.split(" ");
            list[m.get(tmp[0])][m.get(tmp[1])]++;
            sum[m.get(tmp[0])]++;
            sum[m.get(tmp[1])]--;
        }

        int[] ret = new int[cnt];
        for (int i = 0; i < cnt - 1; i++) {
            for (int j = i + 1; j < cnt; j++) {
                if (list[i][j] < list[j][i]) {
                    ret[j]++;
                } else if (list[i][j] > list[j][i]) {
                    ret[i]++;
                } else {
                    if (sum[i] < sum[j]) {
                        ret[j]++;
                    } else if (sum[i] > sum[j]) {
                        ret[i]++;
                    }
                }
            }
        }

        for (int x : ret) {
            answer = Math.max(answer, x);
        }

        return answer;
    }
}
