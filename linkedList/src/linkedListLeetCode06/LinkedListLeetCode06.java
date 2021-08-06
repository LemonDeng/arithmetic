package linkedListLeetCode06;

/**
 * @ClassName:LinkedListLeetCode06
 * @Description: 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 * @Author: Deng Zhi Li
 * @Date: 2021/8/6 9:02
 */
public class LinkedListLeetCode06 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x)
      { val = x; }
  }
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while (node != null)
        {
            count++;
            node = node.next;
        }
        int[] arr = new int[count];
        node = head;
        for (int i = count - 1;i>= 0;i--)
        {
            arr[i] = node.val;
            node = node.next;
        }
        return arr;
    }
}
