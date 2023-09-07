package com.wen.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author wen
 * @Data 2023/5/14 21:32
 */
public class Set {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("jack");
        set.add("nihao");
        set.add("jon");
        set.add("null");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("set" + next);
        }

        System.out.println("=================");
        for (Object o :set){
            System.out.println("set" + o);
        }
    }
}
