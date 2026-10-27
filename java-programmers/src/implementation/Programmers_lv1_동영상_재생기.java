package src.implementation;

public class Programmers_lv1_동영상_재생기 {

    private int timeToSecond(String t) {
        String[] tmp = t.split(":");
        return Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]);
    }

    private String timeToString(int t) {
        StringBuffer ret = new StringBuffer();
        int m = t / 60;

        if (m < 10) {
            ret.append("0");
        }
        ret.append(m).append(":");

        int s = t % 60;
        if (s < 10) {
            ret.append("0");
        }
        ret.append(s);

        return ret.toString();
    }

    public String solution(String video_len, String pos, String op_start, String op_end,
        String[] commands) {
        int videoLen = timeToSecond(video_len);
        int p = timeToSecond(pos);
        int opStart = timeToSecond(op_start);
        int opEnd = timeToSecond(op_end);

        if (opStart <= p && p <= opEnd) {
            p = opEnd;
        }

        for (String command : commands) {
            if ("next".equals(command)) {
                p = Math.min(videoLen, p + 10);
            } else {
                p = Math.max(0, p - 10);
            }

            if (opStart <= p && p <= opEnd) {
                p = opEnd;
            }
        }

        return timeToString(p);
    }
}
