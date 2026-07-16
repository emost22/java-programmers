package src.implementation;

import java.util.Arrays;

public class Programmers_lv0_중앙값_구하기 {

    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length >> 1];
    }
}
