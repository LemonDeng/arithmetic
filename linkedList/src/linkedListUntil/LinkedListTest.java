package linkedListUntil;

import java.util.LinkedList;

/**
 * @ClassName:LinkedListTest
 * @Description: 链表的常用操作
 * @Author: Deng Zhi Li
 * @Date: 2021/8/4 9:41
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //1.增加操作
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("增加元素"+list.toString());
        //2.在指定的索引上进行数据的插入,
        list.add(2,4);
        System.out.println("在指定的索引上进行数据的插入,"+list.toString());

        //访问指定的元素
        Integer integer = list.get(2);
        System.out.println("访问指定的元素"+integer);
        //搜索元素
        list.indexOf(3);
        System.out.println("搜索元素"+list.toString());
        //更新元素
        list.set(0,99);
        System.out.println("更新元素"+list.toString());
        //remove删除元素
        list.remove(3);
        System.out.println("删除元素"+list.toString());
        //长度
        int size = list.size();
        System.out.println("长度："+size);


    }
}
