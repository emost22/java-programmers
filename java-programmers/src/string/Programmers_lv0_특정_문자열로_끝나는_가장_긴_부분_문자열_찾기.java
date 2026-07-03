package src.string;

public class Programmers_lv0_특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {

    public String solution(String myString, String pat) {
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}
