package src.string;

public class Programmers_lv0_글자_이어_붙여_문자열_만들기 {

    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int idx : index_list) {
            answer += my_string.charAt(idx);
        }

        return answer;
    }
}
