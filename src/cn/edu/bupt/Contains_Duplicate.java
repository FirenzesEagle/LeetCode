package cn.edu.bupt;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by FirenzesEagle on 2016/11/29.
 * Email:liumingbo2008@gmail.com
 */

/*217. Contains Duplicate
Given an array of integers, find if the array contains any duplicates.
Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (int x : nums) {
            integerSet.add(x);
        }
        if (integerSet.size() != nums.length)
            return true;
        else
            return false;
    }
}
