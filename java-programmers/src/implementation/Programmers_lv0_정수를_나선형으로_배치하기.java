package src.implementation;

public class Programmers_lv0_정수를_나선형으로_배치하기 {

    private final int direct[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    private boolean isOutOfRange(int x, int y, int n) {
        return x < 0 || y < 0 || x >= n || y >= n;
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int now = 1;
        int d = 0;
        int cnt = n * n;
        int x = 0;
        int y = 0;
        while (cnt-- > 0) {
            answer[x][y] = now++;

            int nx = x + direct[d][0];
            int ny = y + direct[d][1];
            if (isOutOfRange(nx, ny, n) || answer[nx][ny] > 0) {
                d = (d + 1) % 4;
                nx = x + direct[d][0];
                ny = y + direct[d][1];
            }

            x = nx;
            y = ny;
        }

        return answer;
    }
}
