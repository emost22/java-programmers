package src.implementation;

public class Programmers_lv0_n_번째_원소부터 {

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - n + 1];

        for (int i = n - 1; i < num_list.length; i++) {
            answer[i - n + 1] = num_list[i];
        }

        return answer;
    }
}
