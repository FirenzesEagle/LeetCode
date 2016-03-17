package cn.edu.bupt;

import java.util.HashMap;

/**
 * Created by FirenzesEagle on 2016/3/11 0011.
 */

/*3. Longest Substring Without Repeating Characters
 Given a string, find the length of the longest substring without repeating characters.
 For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class Longest_Substring_Without_Repeating_Characters {

    public static void main(String[] args) {
        System.out.println(new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("bbbbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        //keep a hashmap which stores the characters in string as keys and their positions as values
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            if (map.containsKey(s.charAt(i))) {
                //if found in hashmap that value,then update j i.e pointer to the right of the same character last found.
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            //else put in map and get max pointer update with the current longest string
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
