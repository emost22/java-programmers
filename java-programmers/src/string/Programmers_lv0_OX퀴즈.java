package src.string;

import java.util.StringTokenizer;

public class Programmers_lv0_OX퀴즈 {

    private String calc(int x, int y, int z, String op) {
        if ("+".equals(op)) {
            if (x + y == z) {
                return "O";
            }
            return "X";
        } else {
            if (x - y == z) {
                return "O";
            }
            return "X";
        }
    }

    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            StringTokenizer st = new StringTokenizer(quiz[i]);
            int x = Integer.parseInt(st.nextToken());
            String op = st.nextToken();
            int y = Integer.parseInt(st.nextToken());
            st.nextToken();
            int z = Integer.parseInt(st.nextToken());

            answer[i] = calc(x, y, z, op);
        }

        return answer;
    }
}
