package src.math;

public class Programmers_lv0_n보다_커질_때까지_더하기 {

    public int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length && answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
