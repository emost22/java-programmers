package src.math;

public class Programmers_lv0_아이스_아메리카노 {

    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money - answer[0] * 5500;

        return answer;
    }
}
