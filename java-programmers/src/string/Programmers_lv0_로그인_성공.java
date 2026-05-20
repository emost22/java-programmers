package src.string;

public class Programmers_lv0_로그인_성공 {

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for (String[] user : db) {
            if (!id_pw[0].equals(user[0])) {
                continue;
            }

            if (id_pw[1].equals(user[1])) {
                answer = "login";
            } else {
                answer = "wrong pw";
            }

            break;
        }

        if ("".equals(answer)) {
            answer = "fail";
        }

        return answer;
    }
}
