package src.implementation;

public class Programmers_lv0_배열의_길이를_2의_거듭제곱으로_만들기 {

    public int[] solution(int[] arr) {
        int[] answer = {};

        for (int i = 0; ; i++) {
            if ((1 << i) >= arr.length) {
                answer = new int[1 << i];
                break;
            }
        }

        System.arraycopy(arr, 0, answer, 0, arr.length);
        return answer;
    }
}
