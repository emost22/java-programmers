package src.string;

import java.util.ArrayList;

public class Programmers_lv0_공백으로_구분하기_2 {

    public String[] solution(String my_string) {
        ArrayList<String> ret = new ArrayList<>();

        String tmp = "";
        for (char x : my_string.toCharArray()) {
            if (x == ' ') {
                if (!"".equals(tmp)) {
                    ret.add(tmp);
                    tmp = "";
                }

                continue;
            }

            tmp += x;
        }

        if (!"".equals(tmp)) {
            ret.add(tmp);
        }

        return ret.toArray(String[]::new);
    }
}
