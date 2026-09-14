package src.implementation;

import java.util.Arrays;

public class Programmers_lv0_최댓값_만들기_1 {

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
