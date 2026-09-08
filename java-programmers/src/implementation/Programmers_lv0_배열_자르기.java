package src.implementation;

public class Programmers_lv0_배열_자르기 {

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        int idx = 0;
        for (int i = num1; i <= num2; i++) {
            answer[idx++] = numbers[i];
        }

        return answer;
    }
}
