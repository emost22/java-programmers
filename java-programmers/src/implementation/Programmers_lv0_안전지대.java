package src.implementation;

public class Programmers_lv0_안전지대 {

    private int direct[][] = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};

    private boolean isOutOfRange(int x, int y, int n) {
        return x < 0 || y < 0 || x >= n || y >= n;
    }

    public int solution(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    continue;
                }

                boolean chk = true;
                for (int d = 0; d < 8; d++) {
                    int nx = i + direct[d][0];
                    int ny = j + direct[d][1];

                    if (isOutOfRange(nx, ny, board.length)) {
                        continue;
                    }

                    if (board[nx][ny] == 1) {
                        chk = false;
                        break;
                    }
                }

                if (chk) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
