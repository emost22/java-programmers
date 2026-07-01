package src.string;

public class Programmers_lv0_세_개의_구분자 {

    public String[] solution(String myStr) {
        String[] answer = myStr.replaceFirst("^[abc]+", "").split("[abc]+");
        if ("".equals(answer[0])) {
            answer = new String[]{"EMPTY"};
        }

        return answer;
    }
}
