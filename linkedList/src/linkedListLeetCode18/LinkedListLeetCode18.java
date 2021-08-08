package linkedListLeetCode18;


/**
 * @ClassName:LinkedListLeetCode18
 * @Description: 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 *
 * 返回删除后的链表的头节点。
 *
 * 示例 1:
 *
 * 输入: head = [4,5,1,9], val = 5
 * 输出: [4,1,9]
 * @Author: Deng Zhi Li
 * @Date: 2021/8/8 16:40
 */
public class LinkedListLeetCode18 {

    public ListNode deleteNode(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode pre = head,cur = head.next;
            if (head.val == val) return head.next;
            while (cur != null && cur.val != val)
            {
                pre = cur;
                cur = cur.next;
            }
            if (cur != null)
            {
                pre.next = cur.next;
            }
            return dummy.next;

}
    public class ListNode {
        int val;
        LinkedListLeetCode18.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, LinkedListLeetCode18.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
