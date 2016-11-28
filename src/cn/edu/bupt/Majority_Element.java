package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/11/27.
 * Email:liumingbo2008@gmail.com
 */

/*169. Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class Majority_Element {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for (int i : nums) {
            if (count == 0) {
                major = i;
            }
            count += (major == i) ? 1 : -1;
        }
        return major;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2, 2, 3, 4, 4, 5};
        Majority_Element majority_element = new Majority_Element();
        System.out.println(majority_element.majorityElement(input));
    }
}
