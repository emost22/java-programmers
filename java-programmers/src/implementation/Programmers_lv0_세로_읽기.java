package src.implementation;

public class Programmers_lv0_세로_읽기 {

    public String solution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }

        return answer;
    }
}
