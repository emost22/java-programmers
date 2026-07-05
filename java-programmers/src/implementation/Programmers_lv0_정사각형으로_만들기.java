package src.implementation;

public class Programmers_lv0_정사각형으로_만들기 {

    public int[][] solution(int[][] arr) {
        int[][] answer = {};

        int size = Math.max(arr.length, arr[0].length);
        answer = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
