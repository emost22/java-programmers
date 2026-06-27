package src.implementation;

public class Programmers_lv0_수열과_구간_쿼리_3 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        for (int[] q : queries) {
            int tmp = answer[q[0]];
            answer[q[0]] = answer[q[1]];
            answer[q[1]] = tmp;
        }

        return answer;
    }
}
