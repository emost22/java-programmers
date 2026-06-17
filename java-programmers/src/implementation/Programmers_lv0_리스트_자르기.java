package src.implementation;

public class Programmers_lv0_리스트_자르기 {

    private int[] getFirstList(int[] num_list, int b) {
        int[] ret = new int[b + 1];
        for (int i = 0; i <= b; i++) {
            ret[i] = num_list[i];
        }

        return ret;
    }

    private int[] getSecondList(int[] num_list, int a) {
        int[] ret = new int[num_list.length - a];

        int idx = 0;
        for (int i = a; i < num_list.length; i++) {
            ret[idx++] = num_list[i];
        }

        return ret;
    }

    private int[] getThirdList(int[] num_list, int a, int b) {
        int[] ret = new int[b - a + 1];

        int idx = 0;
        for (int i = a; i <= b; i++) {
            ret[idx++] = num_list[i];
        }

        return ret;
    }

    private int[] getFourthList(int[] num_list, int a, int b, int c) {
        int[] ret = new int[(b - a) / c + 1];

        int idx = 0;
        for (int i = a; i <= b; i += c) {
            ret[idx++] = num_list[i];
        }

        return ret;
    }

    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};

        if (n == 1) {
            answer = getFirstList(num_list, slicer[1]);
        } else if (n == 2) {
            answer = getSecondList(num_list, slicer[0]);
        } else if (n == 3) {
            answer = getThirdList(num_list, slicer[0], slicer[1]);
        } else {
            answer = getFourthList(num_list, slicer[0], slicer[1], slicer[2]);
        }

        return answer;
    }
}
