package src.numberTheory;

public class Programmers_lv1_소수_찾기 {

    public int solution(int n) {
        int answer = 0;

        boolean chk[] = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (chk[i]) {
                continue;
            }

            answer++;
            for (int j = 2; i * j <= n; j++) {
                chk[i * j] = true;
            }
        }

        return answer;
    }
}
