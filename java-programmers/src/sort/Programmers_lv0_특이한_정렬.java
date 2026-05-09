package src.sort;

import java.util.Arrays;

public class Programmers_lv0_특이한_정렬 {

    public int[] solution(int[] numlist, int n) {
        Integer[] list = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(list, (a, b) -> {
            int na = Math.abs(n - a);
            int nb = Math.abs(n - b);
            if (na == nb) {
                return b - a;
            }
            return na - nb;
        });

        return Arrays.stream(list).mapToInt(Integer::intValue).toArray();
    }
}
