package src.math;

public class Programmers_lv0_원소들의_곱과_합 {

    public int solution(int[] num_list) {
        int answer = 0;

        int sum = 0;
        int mul = 1;
        for (int x : num_list) {
            sum += x;
            mul *= x;
        }

        if (sum * sum > mul) {
            answer = 1;
        }

        return answer;
    }
}
