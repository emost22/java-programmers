package src.string;

import java.util.ArrayList;

public class Programmers_lv0_ad_제거하기 {

    public String[] solution(String[] strArr) {
        ArrayList<String> ret = new ArrayList<>();

        for (String s : strArr) {
            if (s.contains("ad")) {
                continue;
            }

            ret.add(s);
        }

        return ret.toArray(String[]::new);
    }
}
