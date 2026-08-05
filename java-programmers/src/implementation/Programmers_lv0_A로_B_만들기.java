package src.implementation;

public class Programmers_lv0_A로_B_만들기 {

    public int solution(String before, String after) {
        int[] cnt = new int[26];
        for (char x : before.toCharArray()) {
            cnt[x - 'a']++;
        }

        for (char x : after.toCharArray()) {
            if (cnt[x - 'a']-- == 0) {
                return 0;
            }
        }

        return 1;
    }
}
