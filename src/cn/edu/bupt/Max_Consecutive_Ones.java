package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2017/2/23.
 * Email:liumingbo2008@gmail.com
 */

/*485. Max Consecutive Ones
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
 */
public class Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) temp = 0;
            else {
                temp += 1;
                result = Math.max(temp, result);
            }
        }
        return result;
    }
}
