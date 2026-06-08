package src.string;

public class Programmers_lv0_qr_code {

    public String solution(int q, int r, String code) {
        String answer = "";

        for (int i = 0; i < code.length(); i++) {
            if (i % q != r) {
                continue;
            }

            answer += code.charAt(i);
        }

        return answer;
    }
}
