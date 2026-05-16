package src.math;

public class Programmers_lv0_치킨_쿠폰 {

    public int solution(int chicken) {
        int answer = 0;
        int cnt = chicken;

        answer = cnt / 10;
        cnt = cnt / 10 + cnt % 10;
        while (cnt >= 10) {
            answer += (cnt / 10);
            cnt = cnt / 10 + cnt % 10;
        }

        return answer;
    }
}
