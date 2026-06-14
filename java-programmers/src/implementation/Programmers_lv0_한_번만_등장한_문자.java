package src.implementation;

public class Programmers_lv0_한_번만_등장한_문자 {

    public String solution(String s) {
        String answer = "";

        int[] cnt = new int[26];
        for (char x : s.toCharArray()) {
            cnt[x - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (cnt[i] != 1) {
                continue;
            }

            answer += (char) (i + 'a');
        }

        return answer;
    }
}
