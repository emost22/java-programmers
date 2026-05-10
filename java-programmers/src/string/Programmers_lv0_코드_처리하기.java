package src.string;

public class Programmers_lv0_코드_처리하기 {

    public String solution(String code) {
        String answer = "";

        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
                continue;
            }

            if (mode == 0) {
                if ((i & 1) == 1) {
                    continue;
                }
            } else {
                if ((i & 1) == 0) {
                    continue;
                }
            }

            answer += code.charAt(i);
        }

        if ("".equals(answer)) {
            answer = "EMPTY";
        }

        return answer;
    }
}
