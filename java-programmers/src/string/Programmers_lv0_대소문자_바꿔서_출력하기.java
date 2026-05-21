package src.string;

import java.util.Scanner;

public class Programmers_lv0_대소문자_바꿔서_출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String ret = "";
        for (int i = 0; i < a.length(); i++) {
            int x = a.charAt(i);
            if ('a' <= x && x <= 'z') {
                ret += (char) (x - 32);
            } else {
                ret += (char) (x + 32);
            }
        }

        System.out.println(ret);
    }
}
