package src.string;

public class Programmers_lv0_접두사인지_확인하기 {

    public int solution(String my_string, String is_prefix) {
        int answer = 0;

        if (is_prefix.equals(
            my_string.substring(0, Math.min(my_string.length(), is_prefix.length())))) {
            answer = 1;
        }

        return answer;
    }
}
