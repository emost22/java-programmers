package src.string;

import java.util.Arrays;

public class Programmers_lv0_문자열_잘라서_정렬하기 {

    public String[] solution(String myString) {
        return Arrays.stream(myString.split("x")).filter(x -> !"".equals(x)).sorted()
            .toArray(String[]::new);
    }
}
