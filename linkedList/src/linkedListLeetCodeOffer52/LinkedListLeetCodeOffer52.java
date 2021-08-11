package linkedListLeetCodeOffer52;

/**
 * @ClassName:LinkedListLeetCodeOffer52
 * @Description: TUDO
 * @Author: Deng Zhi Li
 * @Date: 2021/8/11 21:55
 */
public class LinkedListLeetCodeOffer52 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode n1 = headA;
        ListNode n2 = headB;

        while(n1 != n2){
            n1 = n1 == null ? headB : n1.next;
            n2 = n2 == null ? headA : n2.next;
        }
        return n1;
    }
}
