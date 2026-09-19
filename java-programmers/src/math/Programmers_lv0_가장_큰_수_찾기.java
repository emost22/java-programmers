package src.math;

public class Programmers_lv0_가장_큰_수_찾기 {

    public int[] solution(int[] array) {
        int[] answer = new int[]{array[0], 0};

        for (int i = 1; i < array.length; i++) {
            if (answer[0] > array[i]) {
                continue;
            }

            answer[0] = array[i];
            answer[1] = i;
        }

        return answer;
    }
}
