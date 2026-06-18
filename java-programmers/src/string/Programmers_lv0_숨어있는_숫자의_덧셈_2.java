package src.string;

public class Programmers_lv0_숨어있는_숫자의_덧셈_2 {

    public int solution(String my_string) {
        int answer = 0;

        int now = 0;
        for (char x : my_string.toCharArray()) {
            if ('0' <= x && x <= '9') {
                now = now * 10 + x - '0';
            } else {
                answer += now;
                now = 0;
            }
        }

        answer += now;

        return answer;
    }
}
