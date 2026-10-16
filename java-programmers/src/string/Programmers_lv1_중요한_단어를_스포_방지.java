package src.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Programmers_lv1_중요한_단어를_스포_방지 {

    public int solution(String message, int[][] spoiler_ranges) {
        int answer = 0;

        ArrayList<String> list = new ArrayList<>();
        ArrayList<int[]> index = new ArrayList<>();
        String tmp = "";
        int l = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                list.add(tmp);
                index.add(new int[]{l, i - 1});
                tmp = "";
                l = i + 1;
            } else {
                tmp += message.charAt(i);
            }
        }

        if (!"".equals(tmp)) {
            list.add(tmp);
            index.add(new int[]{l, message.length() - 1});
        }

        boolean[] chk = new boolean[index.size()];
        int s = 0;
        for (int[] ranges : spoiler_ranges) {
            for (; s < index.size(); s++) {
                if (ranges[1] < index.get(s)[0]) {
                    break;
                }

                if (ranges[0] > index.get(s)[1]) {
                    continue;
                }

                chk[s] = true;
            }
        }

        Set<String> words = new HashSet<>();
        for (int i = 0; i < chk.length; i++) {
            if (chk[i]) {
                continue;
            }

            words.add(list.get(i));
        }

        for (int i = 0; i < chk.length; i++) {
            if (!chk[i]) {
                continue;
            }

            if (words.contains(list.get(i))) {
                continue;
            }

            answer++;
            words.add(list.get(i));
        }

        return answer;
    }
}
