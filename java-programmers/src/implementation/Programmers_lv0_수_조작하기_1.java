package src.implementation;

public class Programmers_lv0_수_조작하기_1 {

    public int solution(int n, String control) {
        int answer = n;

        for (char x : control.toCharArray()) {
            if (x == 'w') {
                answer++;
            } else if (x == 's') {
                answer--;
            } else if (x == 'd') {
                answer += 10;
            } else {
                answer -= 10;
            }
        }

        return answer;
    }
}
