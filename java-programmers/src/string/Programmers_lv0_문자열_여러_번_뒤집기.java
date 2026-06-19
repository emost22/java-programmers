package src.string;

public class Programmers_lv0_문자열_여러_번_뒤집기 {

    public String solution(String my_string, int[][] queries) {
        String answer = my_string;

        for (int[] q : queries) {
            answer = answer.substring(0, q[0])
                + new StringBuffer(answer.substring(q[0], q[1] + 1)).reverse()
                + answer.substring(q[1] + 1);
        }

        return answer;
    }
}
