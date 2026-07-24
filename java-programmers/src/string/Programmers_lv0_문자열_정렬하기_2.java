package src.string;

import java.util.Arrays;

public class Programmers_lv0_문자열_정렬하기_2 {

    public String solution(String my_string) {
        char[] tmp = my_string.toLowerCase().toCharArray();
        Arrays.sort(tmp);

        return new String(tmp);
    }
}
