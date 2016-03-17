package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/3/17 0017.
 */

/*258. Add Digits
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
 */
public class Add_Digits {
    //使用循环的话可以很快得出结果
//    public int addDigits(int num) {
//        while (num >= 10) {
//            num = num / 10 + num % 10;
//        }
//        return num;
//    }
    //不使用循环的话，可以寻找规律，1 的结果是 1，2->2....9->9, 10->1, 11->2....18->9,19->1....27->9,28->1....到 9\18\27... 的时候会进一变成 1。
    //所以这样答案就是 (n-1)%9+1。其实是运用了数论中树根的知识。
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
