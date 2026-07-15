package src.implementation;

public class Programmers_lv0_중복된_숫자_개수 {

    public int solution(int[] array, int n) {
        int answer = 0;

        for (int x : array) {
            if (x != n) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}
