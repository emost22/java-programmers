package src.string;

import java.util.HashSet;
import java.util.Set;

public class Programmers_lv0_접미사_배열 {

    public String[] solution(String my_string) {
        Set<String> ret = new HashSet<>();

        int len = my_string.length();
        for (int i = len - 1; i >= 0; i--) {
            ret.add(my_string.substring(i, len));
        }

        return ret.stream().sorted().toArray(String[]::new);
    }
}
