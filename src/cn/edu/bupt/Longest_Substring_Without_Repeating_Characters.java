package cn.edu.bupt;

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
        //如果是空串
        if (s.length() == 0) {
            return 0;
        }
        //如果只有一个元素
        else if (s.length() == 1) {
            return 1;
        } else {
            //cache数组用于保存新出现的字符的下标
            int[] cache = new int[256];
            int start = 0, resLen = 0;
            for (int i = 0; i < s.length(); i++) {
                //如果某个字符已经出现过
                if (cache[s.charAt(i)] >= start) {
                    //判断是否是目前最长的无重复字母子串
                    if (i - start > resLen) {
                        resLen = i - start;
                    }
                    //从这个字母首次出现的位置+1，重新进行扫描判断
                    start = cache[s.charAt(i)] + 1;
                }
                //更新当前字符的下标
                cache[s.charAt(i)] = i;
            }
            //如果原始字符串s没有重复字符
            if (resLen > s.length() - start) {
                return resLen;
            } else {
                return s.length() - resLen;
            }
        }
    }
}
