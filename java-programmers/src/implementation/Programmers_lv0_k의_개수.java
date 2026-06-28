package src.implementation;

public class Programmers_lv0_k의_개수 {

    private int count(int x, int k) {
        int ret = 0;
        while (x > 0) {
            if (x % 10 == k) {
                ret++;
            }

            x /= 10;
        }

        return ret;
    }

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int x = i; x <= j; x++) {
            answer += count(x, k);
        }

        return answer;
    }
}
