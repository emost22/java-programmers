package src.bruteforce;

public class Programmers_lv0_순서쌍의_개수 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i * i <= n; i++) {
            if (i * (n / i) != n) {
                continue;
            }

            if (i == n / i) {
                answer++;
            } else {
                answer += 2;
            }
        }

        return answer;
    }
}
