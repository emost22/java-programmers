package src.math;

public class Programmers_lv0_팩토리얼 {

    public int solution(int n) {
        int answer = 0;

        int x = 1;
        for (int i = 2; ; i++) {
            if (x * i > n) {
                answer = i - 1;
                break;
            }
            
            x *= i;
        }

        return answer;
    }
}
