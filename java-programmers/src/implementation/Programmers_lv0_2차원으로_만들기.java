package src.implementation;

public class Programmers_lv0_2차원으로_만들기 {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[(int) (num_list.length / n)][n];

        int idx = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[idx++];
            }
        }

        return answer;
    }
}
