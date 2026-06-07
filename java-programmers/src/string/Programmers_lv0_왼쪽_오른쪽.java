package src.string;

import java.util.ArrayList;

public class Programmers_lv0_왼쪽_오른쪽 {

    public String[] solution(String[] str_list) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                for (int j = 0; j < i; j++) {
                    ret.add(str_list[j]);
                }
                break;
            }

            if ("r".equals(str_list[i])) {
                for (int j = i + 1; j < str_list.length; j++) {
                    ret.add(str_list[j]);
                }
                break;
            }
        }

        return ret.toArray(new String[0]);
    }
}
