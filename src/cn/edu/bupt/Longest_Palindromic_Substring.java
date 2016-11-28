package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/3/17 0017.
 */

/*5. Longest Palindromic Substring
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 */
public class Longest_Palindromic_Substring {

    public static void main(String[] args) {
        System.out.println(new Longest_Palindromic_Substring().isPalindromic("abccba"));
    }

    public boolean isPalindromic(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String s) {

        return null;
    }
}
