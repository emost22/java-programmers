package src.string;

public class Programmers_lv0_다항식_더하기 {

    public String solution(String polynomial) {
        String[] strs = polynomial.split(" \\+ ");
        int x = 0;
        int c = 0;
        for (String str : strs) {
            if (str.charAt(str.length() - 1) == 'x') {
                if (str.length() == 1) {
                    x++;
                } else {
                    x += Integer.parseInt(str.substring(0, str.length() - 1));
                }
            } else {
                c += Integer.parseInt(str);
            }
        }

        String answer = "";
        if (x != 0) {
            if (x != 1) {
                answer = String.valueOf(x);
            }
            answer += "x";

            if (c != 0) {
                answer += " + ";
            }
        }

        if (c != 0) {
            answer += String.valueOf(c);
        }

        return answer;
    }
}
