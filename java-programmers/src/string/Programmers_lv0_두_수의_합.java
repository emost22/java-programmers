package src.string;

public class Programmers_lv0_두_수의_합 {

    public static String solution(String a, String b) {
        String answer = "";

        int aLen = a.length();
        int bLen = b.length();
        if (aLen < bLen) {
            String st = a;
            a = b;
            b = st;

            int tmp = aLen;
            aLen = bLen;
            bLen = tmp;
        }

        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();

        int carry = 0;
        for (int i = 0; i < bLen; i++) {
            int nx = a.charAt(i) - '0' + b.charAt(i) - '0' + carry;
            if (nx > 9) {
                carry = 1;
                answer += (char) (nx - 10 + '0');
            } else {
                carry = 0;
                answer += (char) (nx + '0');
            }
        }

        for (int i = bLen; i < aLen; i++) {
            int nx = a.charAt(i) - '0' + carry;
            if (nx > 9) {
                carry = 1;
                answer += (char) (nx - 10 + '0');
            } else {
                carry = 0;
                answer += (char) (nx + '0');
            }
        }

        if (carry == 1) {
            answer += '1';
        }

        return new StringBuffer(answer).reverse().toString();
    }
}
