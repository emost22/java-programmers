package src.math;

public class Programmers_lv0_평행 {

    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        return (d[1] - c[1]) * (b[0] - a[0]) == (b[1] - a[1]) * (d[0] - c[0]);
    }

    public int solution(int[][] dots) {
        int answer = 0;

        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                for (int p = 0; p < dots.length; p++) {
                    if (i == p || j == p) {
                        continue;
                    }

                    for (int q = 0; q < dots.length; q++) {
                        if (i == q || j == q || q == p) {
                            continue;
                        }

                        if (isParallel(dots[i], dots[j], dots[p], dots[q])) {
                            return 1;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
