package src.string;

public class Programmers_lv0_문자열안에_문자열 {

    public int solution(String str1, String str2) {
        if (str1.contains(str2)) {
            return 1;
        }

        return 2;
    }
}
