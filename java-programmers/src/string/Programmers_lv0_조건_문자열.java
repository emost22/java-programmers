package src.string;

public class Programmers_lv0_조건_문자열 {

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if ("<".equals(ineq) && "=".equals(eq)) {
            answer = (n <= m ? 1 : 0);
        } else if ("<".equals(ineq) && "!".equals(eq)) {
            answer = (n < m ? 1 : 0);
        } else if (">".equals(ineq) && "=".equals(eq)) {
            answer = (n >= m ? 1 : 0);
        } else {
            answer = (n > m ? 1 : 0);
        }

        return answer;
    }
}
