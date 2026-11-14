package src.implementation;

public class Programmres_lv0_외계행성의_나이 {

    public String solution(int age) {
        StringBuffer sb = new StringBuffer();

        while (age > 0) {
            sb.append((char) (age % 10 + 'a'));
            age /= 10;
        }

        return sb.reverse().toString();
    }
}
