import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName:Array
 * @Description: Java数组常用操作
 * @Author: Deng Zhi Li
 * @Date: 2021/7/26 17:04
 */
public class Array {
    //创建数组的方法1
    Integer[] a = {3,2,1};

    //创建数组的方法2
    int[] b = new int[]{1,2,3};

    public void arr()
    {
        //创建数组的方法3
        int[] c = new int[3];
        for (int i = 0; i < c.length; i++) {
            c[i] = i+1;
        }
    }

    @Test
    public void arr1()
    {
        //创建数组的方法4
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i+1);
        }
        //添加元素
        arr.add(3,88);
        System.out.println(arr);

        System.out.println("-------------------");
        //访问元素（）通过数组下标索引进行获取值
        System.out.println(arr.get(3));
        System.out.println("-------------------");
        //更新元素
         arr.set(3,99);
        System.out.println(arr);
        System.out.println("-------------------");
        //删除制定索引的元素
        arr.remove(3);
        System.out.println(arr);
        System.out.println("-------------------");
        //打印数组长度
        System.out.println(arr.size());
        //遍历数组
        System.out.println("-------------------");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        //查找元素
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 3)
            {
                break;
            }
        }
        //排序
        System.out.println("---------排序----------");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("---------排序2----------");
        Collections.sort(arr);
        System.out.println(arr);

        //从大到小排序
        System.out.println("---------排序3----------");
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        System.out.println("---------排序4----------");
        System.out.println(arr);
    }

}
