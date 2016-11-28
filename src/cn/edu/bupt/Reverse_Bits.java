package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/11/28.
 * Email:liumingbo2008@gmail.com
 */

/*190. Reverse Bits
Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?
 */
public class Reverse_Bits {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }
}
