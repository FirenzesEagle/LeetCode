package cn.edu.bupt;

/**
 * Created by bob on 2016/3/9 0009.
 * 2. Add Two Numbers
 * <p>
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * Subscribe to see which companies asked this question
 * <p>
 * /**
 * 这道题其实是大数相加的处理，没什么难度，但需要注意以下几点：
 * 1.因为存储是反过来的，即数字342存成2->4->3，所以要注意进位是向后的；
 * 2.链表l1或l2为空时，直接返回，这是边界条件，省掉多余的操作；
 * 3.链表l1和l2长度可能不同，因此要注意处理某个链表剩余的高位；
 * 4.2个数相加，可能会产生最高位的进位，因此要注意在完成以上1－3的操作后，判断进位是否为0，不为0则需要增加结点存储最高位的进位。
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        //将链表相加的结果保存在L1的存储空间中，用resList保存链表的头结点
        //pre节点用来跟着逐位相加的指针一位位向后走，最后处理最高位进位的情况
        ListNode resList = l1;
        ListNode pre = new ListNode(0);
        pre.next = l1;
        int flag = 0;
        while (l1 != null && l2 != null) {
            l1.val = l1.val + l2.val + flag;
            flag = l1.val / 10;
            l1.val = l1.val % 10;
            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }

        //如果L2有剩余节点，则把他们链接到L1的后面，在下面的while循环中（与L1有剩余节点的情况）统一处理
        if (l2 != null) {
            pre.next = l2;
            l1 = l2;
        }

        //处理L1的剩余节点
        while (l1 != null) {
            l1.val = l1.val + flag;
            flag = l1.val / 10;
            l1.val = l1.val % 10;
            pre = l1;
            l1 = l1.next;
        }

        //最后处理最高位进位增加一个节点的情况
        if (flag > 0){
            pre.next = new ListNode(1);
        }

        return resList;
    }
}
