package src.implementation;

public class Programmers_lv0_특별한_이차원_배열_2 {

    public int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
