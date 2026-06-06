package src.string;

import java.util.ArrayList;

public class Programmers_lv0_잘라서_배열로_저장하기 {

    public String[] solution(String my_str, int n) {
        ArrayList<String> ret = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i += n) {
            ret.add(my_str.substring(i, Math.min(my_str.length(), i + n)));
        }

        return ret.toArray(String[]::new);
    }
}
