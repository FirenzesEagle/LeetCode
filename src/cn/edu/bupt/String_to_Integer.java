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
        // 1. null or empty string
        if (str == null || str.length() == 0) {
            return 0;
        }
        // 2. whitespaces
        str = str.trim();

        // 3. +/- sign
        boolean positive = true;
        int i = 0;
        if (str.charAt(0) == '+') {
            i++;
        } else if (str.charAt(0) == '-') {
            positive = false;
            i++;
        }
        // 4. calculate real value
        double temp = 0;
        for (; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            if (digit < 0 || digit > 9)
                break;
            // 5. handle min & max
            if (positive){
                temp = 10 * temp + digit;
                if (temp > Integer.MAX_VALUE)
                    return Integer.MAX_VALUE;
            } else {
                temp = 10 * temp - digit;
                if (temp < Integer.MIN_VALUE)
                    return Integer.MIN_VALUE;
            }
        }
        int result = (int) temp;
        return result;
    }
}
