package src.string;

import java.util.StringTokenizer;

public class Programmers_lv0_컨트롤_제트 {

    public int solution(String s) {
        int answer = 0;

        int pre = 0;
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String x = st.nextToken();
            if ("Z".equals(x)) {
                answer -= pre;
            } else {
                int a = Integer.parseInt(x);
                answer += a;
                pre = a;
            }
        }

        return answer;
    }
}
