package src.string;

public class Programmers_lv0_l로_만들기 {

    public String solution(String myString) {
        String answer = "";

        for (char x : myString.toCharArray()) {
            if (x <= 'l') {
                answer += 'l';
            } else {
                answer += x;
            }
        }

        return answer;
    }
}
