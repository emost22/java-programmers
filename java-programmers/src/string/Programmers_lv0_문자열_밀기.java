package src.string;

public class Programmers_lv0_문자열_밀기 {

    public static int solution(String A, String B) {
        int answer = 0;

        int cnt = A.length();
        while (answer < cnt) {
            if (A.equals(B)) {
                break;
            }

            A = A.charAt(cnt - 1) + A.substring(0, cnt - 1);
            answer++;
        }

        if (answer == cnt) {
            answer = -1;
        }

        return answer;
    }
}
