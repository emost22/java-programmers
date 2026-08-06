package src.implementation;

import java.util.Arrays;

public class Programmers_lv0_그림_확대 {

    public String[] solution(String[] picture, int k) {
        char[][] ret = new char[picture.length * k][picture[0].length() * k];
        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {
                for (int x = 0; x < k; x++) {
                    for (int y = 0; y < k; y++) {
                        ret[i * k + x][j * k + y] = picture[i].charAt(j);
                    }
                }
            }
        }

        return Arrays.stream(ret).map(String::new).toArray(String[]::new);
    }
}
