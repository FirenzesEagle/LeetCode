package cn.edu.bupt;

/**
 * Created by FirenzesEagle on 2016/3/17 0017.
 */

/*292. Nim Game
You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 */

/*
博弈论入门题目，经过归纳总结，可知无论总数n是多少，都会有1，2，3为必胜态，4为必输态
 */
public class Nim_Game {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}
