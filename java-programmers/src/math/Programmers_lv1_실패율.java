package src.math;

import java.util.Arrays;

public class Programmers_lv1_실패율 {

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        int[] cnt = new int[N + 2];
        int[] dp = new int[N + 2];
        for (int stage : stages) {
            cnt[stage]++;
        }

        dp[N + 1] = cnt[N + 1];
        for (int i = N; i >= 1; i--) {
            dp[i] = cnt[i] + dp[i + 1];
        }

        Node[] list = new Node[N + 2];
        for (int i = N; i >= 1; i--) {
            if (dp[i] == 0) {
                list[i] = new Node(0, i);
            } else {
                list[i] = new Node((double) cnt[i] / (double) dp[i], i);
            }
        }

        Arrays.sort(list, 1, N + 1, (o1, o2) -> {
            if (o1.x == o2.x) {
                return o1.idx - o2.idx;
            } else {
                if (o2.x > o1.x) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });

        return Arrays.stream(list, 1, N + 1).mapToInt(node -> node.idx).toArray();
    }

    private class Node {

        double x;
        int idx;

        public Node(double x, int idx) {
            this.x = x;
            this.idx = idx;
        }
    }
}
