package cn.edu.bupt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FirenzesEagle on 2017/2/23.
 * Email:liumingbo2008@gmail.com
 */

/*500. Keyboard Row
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 */
public class Keyboard_Row {
    public String[] findWords(String[] words) {
        char[] row1 = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] row2 = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] row3 = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        List<char[]> rows = new ArrayList<char[]>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);
        List<String> results = new ArrayList<String>();
        for (String item : words) {
            for (char[] row : rows) {
                int flag = check(item, row);
                if (flag == 1) {
                    results.add(item);
                    break;
                } else if (flag == -1) break;
            }
        }
        return (String[]) (results.toArray(new String[results.size()]));
    }

    private int check(String str, char[] chs) {
        str = str.toLowerCase();
        int flag = 0;
        boolean exits = false;
        boolean not_exits = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (contains(ch, chs)) exits = true;
            else not_exits = true;
            if (exits && not_exits) {
                flag = -1;
                break;
            }

        }
        if (!exits) return 0;
        if (exits && !not_exits) return 1;
        if (flag == -1) return -1;
        return flag;
    }

    private boolean contains(char ch, char[] chs) {
        boolean exits = false;
        for (char item : chs) {
            if (ch == item) {
                exits = true;
                break;
            }
        }
        return exits;
    }
}
