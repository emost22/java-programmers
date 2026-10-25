package src.math;

public class Programmers_lv0_조건에_맞게_수열_변환하기_3 {

    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        if ((k & 1) == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }

        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        }

        return answer;
    }
}
