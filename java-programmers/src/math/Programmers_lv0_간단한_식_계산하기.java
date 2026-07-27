package src.math;

import java.util.StringTokenizer;

public class Programmers_lv0_간단한_식_계산하기 {

    private int calc(int a, int b, String op) {
        if ("+".equals(op)) {
            return a + b;
        }
        if ("-".equals(op)) {
            return a - b;
        }
        
        return a * b;
    }

    public int solution(String binomial) {
        StringTokenizer st = new StringTokenizer(binomial);
        int a = Integer.parseInt(st.nextToken());
        String op = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        return calc(a, b, op);
    }
}
