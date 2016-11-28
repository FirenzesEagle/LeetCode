package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/11/28.
 * Email:liumingbo2008@gmail.com
 */

/*344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */
public class Reverse_String {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
