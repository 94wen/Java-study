package com.wen.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author wen
 * @Data 2023/5/8 21:37
 */
public class ListEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        System.out.println(list);
        System.out.println("===2号位插入");
        list.add(1,"韩顺平教育");
        System.out.println(list);
        System.out.println("===获取第5个元素");
        Object ele = list.get(4);
        System.out.println(ele);
        System.out.println("===删除第6个元素");
        list.remove(5);
        System.out.println(list);
        System.out.println("===修改第七个元素");
        list.set(6,"Z");
        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("最终数组为：" + next);
        }
    }
}
