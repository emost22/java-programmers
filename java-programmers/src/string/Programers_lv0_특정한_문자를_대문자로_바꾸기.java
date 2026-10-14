package src.string;

public class Programers_lv0_특정한_문자를_대문자로_바꾸기 {

    public String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
