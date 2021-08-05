package linkedListLeetCode203;

import java.util.LinkedList;

/**
 * @ClassName:LinkedListLeetCode203
 * @Description: 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * * public class ListNode {
 * *     int val;
 * *     ListNode next;
 * *     ListNode() {}
 * *     ListNode(int val) { this.val = val; }
 * *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * * }
 * @Author: Deng Zhi Li
 * @Date: 2021/8/4 13:43
 */
public class LinkedListLeetCode203 {
    //删除链表中的元素
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public  ListNode  removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode pre = temp;
        while (head != null && head.next != null)
        {
            if (head.val == val)
            {
                pre.next = head.next;
                head = head.next;
            }else
            {
                pre = head;
                head = head.next;
            }
        }
        return temp.next;

    }
}
