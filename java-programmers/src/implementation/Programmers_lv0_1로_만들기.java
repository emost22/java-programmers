package src.implementation;

public class Programmers_lv0_1로_만들기 {

    public int solution(int[] num_list) {
        int answer = 0;

        for (int x : num_list) {
            while (x > 1) {
                x >>= 1;
                answer++;
            }
        }

        return answer;
    }
}
