package src.string;

public class Programmers_lv0_숨어있는_숫자의_덧셈_1 {

    public int solution(String my_string) {
        int answer = 0;

        for (char x : my_string.toCharArray()) {
            if ('1' > x || x > '9') {
                continue;
            }

            answer += (x - '0');
        }

        return answer;
    }
}
