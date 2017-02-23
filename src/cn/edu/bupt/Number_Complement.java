package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2017/2/23.
 * Email:liumingbo2008@gmail.com
 */

/*476. Number Complement
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
1. The given integer is guaranteed to fit within the range of a 32-bit signed integer.
2. You could assume no leading zero bit in the integer’s binary representation.
 */
public class Number_Complement {
    public int findComplement(int num) {
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
