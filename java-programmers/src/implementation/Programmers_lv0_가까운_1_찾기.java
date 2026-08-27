package src.implementation;

public class Programmers_lv0_가까운_1_찾기 {

    public int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }

            return i;
        }

        return -1;
    }
}
