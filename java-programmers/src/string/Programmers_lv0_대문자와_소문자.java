package src.string;

public class Programmers_lv0_대문자와_소문자 {

    public String solution(String my_string) {
        String answer = "";

        for (char x : my_string.toCharArray()) {
            if ('a' <= x) {
                answer += (char) (x - 32);
            } else {
                answer += (char) (x + 32);
            }
        }

        return answer;
    }
}
