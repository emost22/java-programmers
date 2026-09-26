package src.implementation;

public class Programmers_lv0_머쓱이보다_키_큰_사람 {

    public int solution(int[] array, int height) {
        int answer = 0;

        for (int x : array) {
            if (x <= height) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
