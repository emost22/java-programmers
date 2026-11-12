package src.math;

public class Programmers_lv0_커피_심부름 {

    public int solution(String[] order) {
        int answer = 0;

        for (String str : order) {
            if (str.contains("americano") || str.contains("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }

        return answer;
    }
}
