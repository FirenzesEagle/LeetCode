package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/3/17 0017.
 */

/*136. Single Number
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Single_Number {
    //需要额外存储空间
//    public int singleNumber(int[] nums) {
//        int i = 0;
//        Arrays.sort(nums);
//        for (i = 0; i < nums.length; i++) {
//            if ((i + 1 == nums.length) || nums[i] != nums[i + 1]) {
//                break;
//            } else {
//                i++;
//            }
//        }
//        return nums[i];
//    }
    //不需要额外存储空间，异或运算可以交换顺序，如：(2^1^4^5^2^4^1) => ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }
}
