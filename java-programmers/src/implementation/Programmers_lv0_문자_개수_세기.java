package src.implementation;

public class Programmers_lv0_문자_개수_세기 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char x : my_string.toCharArray()) {
            if (x <= 'Z') {
                answer[x - 'A']++;
            } else {
                answer[x - 'a' + 26]++;
            }
        }

        return answer;
    }
}
