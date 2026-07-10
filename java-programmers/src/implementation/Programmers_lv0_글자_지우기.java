package src.implementation;

public class Programmers_lv0_글자_지우기 {

    public String solution(String my_string, int[] indices) {
        String answer = "";

        boolean[] index = new boolean[my_string.length()];
        for (int i : indices) {
            index[i] = true;
        }

        for (int i = 0; i < my_string.length(); i++) {
            if (index[i]) {
                continue;
            }

            answer += my_string.charAt(i);
        }

        return answer;
    }
}
