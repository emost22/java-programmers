package src.numberTheory;

public class Programmers_lv0_합성수_찾기 {

    private boolean[] chk;

    public int solution(int n) {
        int answer = 0;

        chk = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (chk[i]) {
                continue;
            }

            for (int j = 2; i * j <= n; j++) {
                chk[i * j] = true;
            }
        }

        for (int i = 4; i <= n; i++) {
            if (!chk[i]) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
