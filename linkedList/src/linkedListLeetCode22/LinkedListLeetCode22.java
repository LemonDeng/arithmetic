package linkedListLeetCode22;



/**
 * @ClassName:LinkedListLeetCode22
 * @Description: 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
 * 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。
 *
 * @Author: Deng Zhi Li
 * @Date: 2021/8/7 9:59
 */
public class LinkedListLeetCode22 {
    public class ListNode {
        int val;
        LinkedListLeetCode22.ListNode next;
        ListNode(int x) { val = x; }
    }
    //快慢指针题目，先让前指针先走k步，然后再和后指针同步移动，当前指针为空的时候，返回的后指针指向的节点就是倒数的节点
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode frontNode = head,behindNode = head;
        while (frontNode != null && k > 0)
        {
            frontNode = frontNode.next;
            k--;
        }
        while (frontNode != null)
        {
            frontNode = frontNode.next;
            behindNode = behindNode.next;
        }

        return behindNode;
    }
}
