package src.string;

public class Programmers_lv0_가위_바위_보 {

    private char getCheat(char x) {
        if (x == '2') {
            return '0';
        }
        if (x == '0') {
            return '5';
        }

        return '2';
    }

    public String solution(String rsp) {
        String answer = "";

        for (char x : rsp.toCharArray()) {
            answer += getCheat(x);
        }

        return answer;
    }
}
