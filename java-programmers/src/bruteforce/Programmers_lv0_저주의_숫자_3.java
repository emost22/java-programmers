package src.bruteforce;

public class Programmers_lv0_저주의_숫자_3 {

    private boolean isContainsThree(String str) {
        char[] s = str.toCharArray();
        for (char x : s) {
            if (x == '3') {
                return true;
            }
        }

        return false;
    }

    private boolean isMultipleOfThree(int x) {
        return x % 3 == 0;
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            while (isContainsThree(String.valueOf(answer + 1)) || isMultipleOfThree(answer + 1)) {
                answer++;
            }
            
            answer++;
        }

        return answer;
    }
}
