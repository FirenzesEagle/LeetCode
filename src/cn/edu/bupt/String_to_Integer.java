package cn.edu.bupt;

/**
 * Created by liumingbo on 2016/11/29.
 */

/*8. String to Integer (atoi)
Implement atoi to convert a string to an integer.

Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.

Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 */
public class String_to_Integer {
    public int myAtoi(String str) {
        StringBuilder sb = new StringBuilder();
        if ("".equals(str) || "+".equals(str) || "-".equals(str)) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                sb.append(str.charAt(i));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
