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
        System.out.println(new Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        //使用HashMap来存储字符串，Key存储单个字符，Value存储字符在字符串中所在的位置
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //left记录某字符串上次出现的位置
        int max = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            //如果该字符已经存在
            if (map.containsKey(s.charAt(i))) {
                //更新该字符上次出现的位置
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            }
            //否则将该字符的位置作为Value放置到HashMap中，计算目前最长字符串
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
