package src.string;

public class Programmers_lv0_외계어_사전 {

    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String d : dic) {
            int sum = 0;
            for (String sp : spell) {
                int cnt = 0;
                for (int i = 0; i < d.length(); i++) {
                    if (sp.charAt(0) == d.charAt(i)) {
                        cnt++;
                    }
                }

                if (cnt != 1) {
                    break;
                }

                sum++;
            }

            if (sum == spell.length) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
