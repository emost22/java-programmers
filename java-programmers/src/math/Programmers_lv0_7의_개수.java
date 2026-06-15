package src.math;

public class Programmers_lv0_7의_개수 {

    public int solution(int[] array) {
        int answer = 0;

        for (int x : array) {
            while (x > 0) {
                if (x % 10 == 7) {
                    answer++;
                }

                x /= 10;
            }
        }

        return answer;
    }
}
