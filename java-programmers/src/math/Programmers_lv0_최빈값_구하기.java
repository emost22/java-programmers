package src.math;

public class Programmers_lv0_최빈값_구하기 {

    private final int MAX = 1000;

    public int solution(int[] array) {
        int answer = 0;

        int[] cnt = new int[MAX];
        for (int a : array) {
            cnt[a]++;
        }

        int d = 0;
        int mx = 0;
        for (int i = 0; i < MAX; i++) {
            if (cnt[i] > mx) {
                mx = cnt[i];
                answer = i;
                d = 1;
            } else if (cnt[i] == mx) {
                d++;
            }
        }

        if (d > 1) {
            answer = -1;
        }

        return answer;
    }
}
