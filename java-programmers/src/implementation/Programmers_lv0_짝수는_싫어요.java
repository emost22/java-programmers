package src.implementation;

public class Programmers_lv0_짝수는_싫어요 {

    public int[] solution(int n) {
        int[] answer = new int[(n + 1) >> 1];

        int idx = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[idx++] = i;
        }
        
        return answer;
    }
}
