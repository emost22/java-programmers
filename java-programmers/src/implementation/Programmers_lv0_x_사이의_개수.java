package src.implementation;

import java.util.ArrayList;

public class Programmers_lv0_x_사이의_개수 {

    public int[] solution(String myString) {
        ArrayList<Integer> ret = new ArrayList<>();

        int pre = -1;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                ret.add(i - pre - 1);
                pre = i;
            }
        }

        ret.add(myString.length() - 1 - pre);

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
