package src.string;

public class Programmers_lv0_문자열_뒤집기 {

    public String solution(String my_string, int s, int e) {
        return my_string.substring(0, s) + new StringBuffer(my_string.substring(s, e + 1)).reverse()
            .toString() + my_string.substring(e + 1);
    }
}
