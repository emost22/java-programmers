package src.math;

public class Programmers_lv0_9로_나눈_나머지 {

    public int solution(String number) {
        int answer = 0;

        for (char x : number.toCharArray()) {
            answer += (x - '0');
        }

        return answer % 9;
    }
}
