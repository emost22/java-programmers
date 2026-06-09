package src.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_lv0_진료순서_정하기 {

    public int[] solution(int[] emergency) {
        Node[] nodes = new Node[emergency.length];
        for (int i = 1; i <= emergency.length; i++) {
            nodes[i - 1] = new Node(i, emergency[i - 1], 0);
        }
        Arrays.sort(nodes, (o1, o2) -> o2.x - o1.x);

        for (int i = 0; i < nodes.length; i++) {
            nodes[i].rank = i + 1;
        }
        Arrays.sort(nodes, Comparator.comparingInt(o -> o.idx));

        return Arrays.stream(nodes).mapToInt(node -> node.rank).toArray();
    }

    class Node {

        private int idx;
        private int x;
        private int rank;

        public Node(int idx, int x, int rank) {
            this.idx = idx;
            this.x = x;
            this.rank = rank;
        }
    }
}
