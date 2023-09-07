package com.wen.hashset;

import java.util.HashSet;

/**
 * @Author wen
 * @Data 2023/9/1 20:51
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("main",12));
        hashSet.add(new Employee("main",23));
        hashSet.add(new Employee("main",12));
        System.out.println(hashSet);
    }
}
