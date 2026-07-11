package src.math;

public class Programmers_lv0_등차수열의_특정한_항만_더하기 {

    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        int now = a;
        for (int i = 0; i < included.length; i++, now += d) {
            if (!included[i]) {
                continue;
            }

            answer += now;
        }

        return answer;
    }
}
