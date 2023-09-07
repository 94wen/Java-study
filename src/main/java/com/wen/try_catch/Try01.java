package com.wen.try_catch;

import java.util.Scanner;

/**
 * @Author wen
 * @Data 2023/4/14 17:27
 */
public class Try01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        int num = 0;
        while (true){
            System.out.println("请输入一个整数");
            password = scanner.next();
            try {
                num = Integer.parseInt(password);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入异常");
            }
        }
        System.out.println("值为" + num);
    }
}
