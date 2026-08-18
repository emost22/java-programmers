package src.math;

public class Programmers_lv0_문자열_정수의_합 {

    public int solution(String num_str) {
        int answer = 0;

        for (char x : num_str.toCharArray()) {
            answer += (x - '0');
        }

        return answer;
    }
}
