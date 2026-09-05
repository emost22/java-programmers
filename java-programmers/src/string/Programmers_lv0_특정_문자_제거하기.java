package src.string;

public class Programmers_lv0_특정_문자_제거하기 {

    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
