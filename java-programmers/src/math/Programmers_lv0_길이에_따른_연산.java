package src.math;

public class Programmers_lv0_길이에_따른_연산 {

    public int solution(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            for (int x : num_list) {
                answer += x;
            }
        } else {
            answer = 1;
            for (int x : num_list) {
                answer *= x;
            }
        }

        return answer;
    }
}
