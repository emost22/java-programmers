package src.math;

public class Programmers_lv0_직사각형_넓이_구하기 {

    public int solution(int[][] dots) {
        int lx = Integer.MAX_VALUE;
        int rx = Integer.MIN_VALUE;
        int ly = Integer.MAX_VALUE;
        int ry = Integer.MIN_VALUE;
        for (int[] a : dots) {
            lx = Math.min(lx, a[0]);
            rx = Math.max(rx, a[0]);
            ly = Math.min(ly, a[1]);
            ry = Math.max(ry, a[1]);
        }

        return (rx - lx) * (ry - ly);
    }
}
