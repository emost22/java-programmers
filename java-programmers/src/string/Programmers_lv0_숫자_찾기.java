package src.string;

public class Programmers_lv0_숫자_찾기 {

    public int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' != k) {
                continue;
            }

            answer = i + 1;
            break;
        }

        return answer;
    }
}
