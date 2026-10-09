package src.string;

public class Programmers_lv0_부분_문자열인지_확인하기 {

    public int solution(String my_string, String target) {
        if (my_string.contains(target)) {
            return 1;
        }

        return 0;
    }
}
