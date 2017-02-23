package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2017/2/23.
 * Email:liumingbo2008@gmail.com
 */

/*461. Hamming Distance
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.
 */
public class Hamming_Distance {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
