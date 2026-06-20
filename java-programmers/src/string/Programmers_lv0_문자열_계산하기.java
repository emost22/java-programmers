package src.string;

import java.util.StringTokenizer;

public class Programmers_lv0_문자열_계산하기 {

    public int solution(String my_string) {
        int answer = 0;

        StringTokenizer st = new StringTokenizer(my_string);
        boolean isPlus = true;
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if ("+".equals(s)) {
                isPlus = true;
            } else if ("-".equals(s)) {
                isPlus = false;
            } else {
                if (isPlus) {
                    answer += Integer.parseInt(s);
                } else {
                    answer -= Integer.parseInt(s);
                }
            }
        }

        return answer;
    }
}
