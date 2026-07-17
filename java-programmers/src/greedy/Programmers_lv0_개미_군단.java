package src.greedy;

public class Programmers_lv0_개미_군단 {

    private final int GENERAL = 5;
    private final int SOLDIER = 3;
    private final int WORK = 1;

    public int solution(int hp) {
        int answer = 0;

        answer += (hp / GENERAL);
        hp %= GENERAL;

        answer += (hp / SOLDIER);
        hp %= SOLDIER;

        answer += hp;

        return answer;
    }
}
