package src.implementation;

public class Programmers_lv0_2의_영역 {

    public int[] solution(int[] arr) {
        int[] answer = {};

        int l = -1;
        int r = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 2) {
                continue;
            }

            if (l == -1) {
                l = i;
            }

            r = i;
        }

        if (l == -1) {
            return new int[]{-1};
        }

        answer = new int[r - l + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[l++];
        }

        return answer;
    }
}
