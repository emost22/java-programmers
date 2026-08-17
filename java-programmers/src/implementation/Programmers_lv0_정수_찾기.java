package src.implementation;

public class Programmers_lv0_정수_찾기 {

    public int solution(int[] num_list, int n) {
        for (int x : num_list) {
            if (x == n) {
                return 1;
            }
        }

        return 0;
    }
}
