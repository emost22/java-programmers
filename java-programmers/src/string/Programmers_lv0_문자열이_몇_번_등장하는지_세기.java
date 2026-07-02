package src.string;

public class Programmers_lv0_문자열이_몇_번_등장하는지_세기 {

    public int solution(String myString, String pat) {
        int answer = 0;

        int len = pat.length();
        for (int i = 0; i < myString.length() - len + 1; i++) {
            if (!pat.equals(myString.substring(i, i + len))) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
