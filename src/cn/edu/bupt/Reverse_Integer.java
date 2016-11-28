package cn.edu.bupt;

/**
 * Created by liumingbo on 2016/11/28.
 */

/*7. Reverse Integer
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
 */
public class Reverse_Integer {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result != 0 && Integer.MAX_VALUE / result < 10 && Integer.MAX_VALUE / result > -10){
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
