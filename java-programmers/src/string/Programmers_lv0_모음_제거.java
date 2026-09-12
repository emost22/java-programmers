package src.string;

public class Programmers_lv0_모음_제거 {

    public String solution(String my_string) {
        String answer = "";

        for (char x : my_string.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'o' || x == 'i' || x == 'u') {
                continue;
            }

            answer += x;
        }

        return answer;
    }
}
