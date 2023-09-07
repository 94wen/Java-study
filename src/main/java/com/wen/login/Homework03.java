package com.wen.login;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author wen
 * @Data 2023/5/7 0:17
 */
public class Homework03 {
    public static void main(String[] args) {
        System.out.println("请输入名字：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        nameF(name);
    }
    public static void nameF(String name){
        String[] str = name.split(" ");
        if (str.length != 3){
            System.out.println("格式错误");
            return;
        }
        String format = String.format("%s,%s.%c ", str[2],str[0],str[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
