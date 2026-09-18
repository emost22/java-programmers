package src.string;

public class Programmers_lv0_배열의_유사도 {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String str1 : s1) {
            for (String str2 : s2) {
                if (!str1.equals(str2)) {
                    continue;
                }

                answer++;
            }
        }

        return answer;
    }
}
