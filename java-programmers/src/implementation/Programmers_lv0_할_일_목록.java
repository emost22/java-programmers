package src.implementation;

import java.util.ArrayList;

public class Programmers_lv0_할_일_목록 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> ret = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i]) {
                continue;
            }

            ret.add(todo_list[i]);
        }

        return ret.toArray(String[]::new);
    }
}
