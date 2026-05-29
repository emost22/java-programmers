package src.bitmasking;

import java.util.ArrayList;

public class Programmers_lv1_1차_비밀지도 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean[] chk = new boolean[n];
            for (int j = 0; j < n; j++) {
                if ((arr1[i] & (1 << j)) == 0 && (arr2[i] & (1 << j)) == 0) {
                    continue;
                }

                chk[j] = true;
            }

            String str = "";
            for (int j = n - 1; j >= 0; j--) {
                if (chk[j]) {
                    str += "#";
                } else {
                    str += " ";
                }
            }

            list.add(str);
        }

        return list.toArray(String[]::new);
    }
}
