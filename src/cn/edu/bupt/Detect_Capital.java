package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2017/2/23.
 * Email:liumingbo2008@gmail.com
 */

/*520. Detect Capital
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class Detect_Capital {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        String up = word.toUpperCase();
        String low = word.toLowerCase();
        if (word.equals(up) || word.equals(low))
            return true;
        String last = word.substring(1, len);
        if (last.toLowerCase().equals(last))
            return true;
        return false;
    }
}
