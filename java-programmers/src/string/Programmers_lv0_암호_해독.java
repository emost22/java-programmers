package src.string;

public class Programmers_lv0_암호_해독 {

    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = 0; i < cipher.length(); i++) {
            if (i % code < code - 1) {
                continue;
            }

            answer += cipher.charAt(i);
        }

        return answer;
    }
}
