package src.math;

public class Programmers_lv0_옷가게_할인_받기 {

    public int solution(int price) {
        if (price >= 500000) {
            return (int) (price * 0.8);
        }

        if (price >= 300000) {
            return (int) (price * 0.9);
        }

        if (price >= 100000) {
            return (int) (price * 0.95);
        }

        return price;
    }
}
