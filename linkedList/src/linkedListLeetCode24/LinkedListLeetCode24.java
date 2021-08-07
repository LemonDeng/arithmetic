package linkedListLeetCode24;

import linkedListLeetCode25.LinkedListLeetCode25;

/**
 * @ClassName:LinkedListLeetCode24
 * @Description: 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 * @Author: Deng Zhi Li
 * @Date: 2021/8/7 10:43
 */
public class LinkedListLeetCode24 {
    public class ListNode {
        int val;
        LinkedListLeetCode24.ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while (head != null && head.next != null)
        {
            ListNode hnext = head.next;
            ListNode dnext = dummy.next;

            dummy.next = hnext;
            head.next = hnext.next;
            hnext.next = dnext;
        }
        return dummy.next;
    }

}
