package src.string;

public class Programmers_lv0_문자열_바꿔서_찾기 {

    public int solution(String myString, String pat) {
        int answer = 0;

        char[] tmp = myString.toCharArray();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 'A') {
                tmp[i] = 'B';
            } else {
                tmp[i] = 'A';
            }
        }
        myString = new String(tmp);

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (pat.equals(myString.substring(i, i + pat.length()))) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
