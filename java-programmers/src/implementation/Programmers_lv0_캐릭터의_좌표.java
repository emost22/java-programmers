package src.implementation;

public class Programmers_lv0_캐릭터의_좌표 {

    private int[][] direct = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

    private boolean isOutOfRange(int x, int y, int sx, int sy, int ex, int ey) {
        return x < sx || y < sy || x > ex || y > ey;
    }

    private int searchIndex(String key) {
        if ("up".equals(key)) {
            return 0;
        }
        if ("down".equals(key)) {
            return 1;
        }
        if ("left".equals(key)) {
            return 2;
        }
        return 3;
    }

    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int x = (board[0] - 1) >> 1;
        int y = (board[1] - 1) >> 1;

        for (String key : keyinput) {
            int idx = searchIndex(key);
            if (isOutOfRange(answer[0] + direct[idx][0], answer[1] + direct[idx][1], -x, -y, x,
                y)) {
                continue;
            }

            answer[0] += direct[idx][0];
            answer[1] += direct[idx][1];
        }

        return answer;
    }
}
