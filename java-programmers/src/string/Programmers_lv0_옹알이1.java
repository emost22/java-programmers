package src.string;

public class Programmers_lv0_옹알이1 {

    private final String pat[] = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            int len = 0;
            for (String p : pat) {
                if (str.contains(p)) {
                    len += p.length();
                }
            }

            if (len == str.length()) {
                answer++;
            }
        }

        return answer;
    }
}
