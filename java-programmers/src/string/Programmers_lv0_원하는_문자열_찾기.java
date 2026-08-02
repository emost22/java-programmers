package src.string;

public class Programmers_lv0_원하는_문자열_찾기 {

    private int isContainPattern(String str, String pat) {
        for (int i = 0; i <= str.length() - pat.length(); i++) {
            if (pat.equals(str.substring(i, i + pat.length()))) {
                return 1;
            }
        }

        return 0;
    }

    public int solution(String myString, String pat) {
        return isContainPattern(myString.toLowerCase(), pat.toLowerCase());
    }
}
