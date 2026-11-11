package src.string;

public class Programmers_lv0_영어가_싫어요 {

    public long solution(String numbers) {
        long answer = 0;

        for (int i = 0; i < numbers.length(); i++) {
            if (i + 2 < numbers.length() && "one".equals(numbers.substring(i, i + 3))) {
                answer = answer * 10L + 1L;
                i += 2;
            } else if (i + 2 < numbers.length() && "two".equals(numbers.substring(i, i + 3))) {
                answer = answer * 10L + 2L;
                i += 2;
            } else if (i + 4 < numbers.length() && "three".equals(numbers.substring(i, i + 5))) {
                answer = answer * 10L + 3L;
                i += 4;
            } else if (i + 3 < numbers.length() && "four".equals(numbers.substring(i, i + 4))) {
                answer = answer * 10L + 4L;
                i += 3;
            } else if (i + 3 < numbers.length() && "five".equals(numbers.substring(i, i + 4))) {
                answer = answer * 10L + 5L;
                i += 3;
            } else if (i + 2 < numbers.length() && "six".equals(numbers.substring(i, i + 3))) {
                answer = answer * 10L + 6L;
                i += 2;
            } else if (i + 4 < numbers.length() && "seven".equals(numbers.substring(i, i + 5))) {
                answer = answer * 10L + 7L;
                i += 4;
            } else if (i + 4 < numbers.length() && "eight".equals(numbers.substring(i, i + 5))) {
                answer = answer * 10L + 8L;
                i += 4;
            } else if (i + 3 < numbers.length() && "nine".equals(numbers.substring(i, i + 4))) {
                answer = answer * 10L + 9L;
                i += 3;
            } else {
                answer = answer * 10L;
                i += 3;
            }
        }

        return answer;
    }
}
