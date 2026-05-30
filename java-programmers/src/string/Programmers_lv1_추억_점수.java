package src.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Programmers_lv1_추억_점수 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> ret = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        int n = name.length;
        for (int i = 0; i < n; i++) {
            m.put(name[i], yearning[i]);
        }

        for (String[] list : photo) {
            int score = 0;
            for (String str : list) {
                if (!m.containsKey(str)) {
                    continue;
                }

                score += m.get(str);
            }
            
            ret.add(score);
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
