package src.string;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Programmers_lv0_모스부호_1 {

    private Map<String, String> morse = new HashMap<>();

    private void init() {
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
    }

    public String solution(String letter) {
        init();

        String answer = "";
        StringTokenizer st = new StringTokenizer(letter);
        while (st.hasMoreTokens()) {
            answer += morse.get(st.nextToken());
        }

        return answer;
    }
}
