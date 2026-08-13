package src.implementation;

import java.util.ArrayList;

public class Programmers_lv0_빈_배열에_추가_삭제하기 {

    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> ret = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < (arr[i] << 1); j++) {
                    ret.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    ret.remove(ret.size() - 1);
                }
            }
        }

        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
