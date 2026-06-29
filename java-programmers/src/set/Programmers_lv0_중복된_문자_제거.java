package src.set;

import java.util.HashSet;
import java.util.Set;

public class Programmers_lv0_중복된_문자_제거 {

    public String solution(String my_string) {
        String answer = "";

        Set<Character> s = new HashSet<>();
        for (char x : my_string.toCharArray()) {
            if (s.contains(x)) {
                continue;
            }

            s.add(x);
            answer += x;
        }

        return answer;
    }
}
