package com.wen.Arrays;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

/**
 * @Author wen
 * @Data 2023/4/27 21:32
 */
public class Array01 {
    public static void main(String[] args) {
        Integer[] arr = {1,3,54,67,89,678};
        //查找元素索引
        int index = Arrays.binarySearch(arr,54);
        System.out.println(index);
        //复制
        Integer[] copyarr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(copyarr));
        //填充数组
        Integer[] arr1 = {1,2,3,45,5};
        Arrays.fill(arr1,99);
        System.out.println(Arrays.toString(arr1));
        //比较数组
        Integer[] arr2 = {1,1,1,1,1};
        boolean equals = Arrays.equals(arr1,arr2);
        System.out.println("equals=" + equals);
        //装换为list
        List aslist  = Arrays.asList(1,3,4,5,6);
        System.out.println(aslist);
    }
}
