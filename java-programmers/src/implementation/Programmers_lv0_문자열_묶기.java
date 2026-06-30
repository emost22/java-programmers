package src.implementation;

public class Programmers_lv0_문자열_묶기 {

    private final int MAX = 31;

    public int solution(String[] strArr) {
        int answer = 0;

        int[] cnt = new int[MAX];
        for (String s : strArr) {
            cnt[s.length()]++;
        }

        for (int i = 1; i < MAX; i++) {
            answer = Math.max(answer, cnt[i]);
        }

        return answer;
    }
}
