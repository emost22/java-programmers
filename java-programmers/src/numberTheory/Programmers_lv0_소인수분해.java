package src.numberTheory;

import java.util.ArrayList;

public class Programmers_lv0_소인수분해 {

    private final int MAX = 10000;

    public int[] solution(int n) {
        boolean[] chk = new boolean[MAX + 1];
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 2; i <= MAX; i++) {
            if (chk[i]) {
                continue;
            }
            prime.add(i);

            for (int j = 2; i * j <= MAX; j++) {
                chk[i * j] = true;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int p : prime) {
            if (n < p) {
                break;
            }
            
            if (n % p != 0) {
                continue;
            }

            list.add(p);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
