package src.string;

public class Programmers_lv0_꼬리_문자열 {

    public String solution(String[] str_list, String ex) {
        String answer = "";

        for (String str : str_list) {
            if (str.contains(ex)) {
                continue;
            }

            answer += str;
        }

        return answer;
    }
}
