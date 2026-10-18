package src.math;

public class Programmers_lv1_택배_상자_꺼내기 {

    public int solution(int n, int w, int num) {
        int answer = 0;

        int x = 0;
        int y = 0;
        int[][] list = new int[n + 1][w];
        for (int i = 1; i <= n; i++) {
            int px = (i - 1) / w;
            int py = 0;
            if ((((i - 1) / w) & 1) == 0) {
                py = (i - 1) % w;
            } else {
                py = w - 1 - ((i - 1) % w);
            }

            list[px][py] = i;

            if (num == i) {
                x = px;
                y = py;
            }
        }

        for (int i = x; list[i][y] > 0; i++) {
            answer++;
        }

        return answer;
    }
}
