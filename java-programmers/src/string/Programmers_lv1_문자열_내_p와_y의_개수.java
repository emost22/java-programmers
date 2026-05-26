package src.string;

public class Programmers_lv1_문자열_내_p와_y의_개수 {

    boolean solution(String s) {
        int p = 0;
        int y = 0;
        for (char x : s.toLowerCase().toCharArray()) {
            if (x == 'p') {
                p++;
            } else if (x == 'y') {
                y++;
            }
        }

        return p == y;
    }
}
