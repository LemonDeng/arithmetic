package linkedListLeetCode206;

import java.util.List;

/**
 * @ClassName:LinkedListLeetCode206
 * @Description: 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @Author: Deng Zhi Li
 * @Date: 2021/8/5 9:42
 */
public class LinkedListLeetCode206 {
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

    public ListNode reverseList(ListNode head) {
            //临时值取什么值都可以不用care
            ListNode temp = new ListNode(1);
            temp.next = head;
            while (head != null && head.next != null)
            {

                ListNode hnext = head.next;
                ListNode tnext = temp.next;

                temp.next = hnext;
                head.next = hnext.next;
                hnext.next = tnext;
            }
            return temp.next;
    }
}
