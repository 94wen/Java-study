package com.wen.login;

import java.util.Scanner;

/**
 * @Author wen
 * @Data 2023/5/6 22:05
 */
public class login {
    public static void main(String[] args) {
        String name;
        String paw;
        String email;
        System.out.println("请输入用户名，密码，邮箱");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        paw = scanner.next();
        email = scanner.next();
        try {
            userLogin(name,paw,email);
            System.out.println("成功");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void userLogin(String name,String paw,String email){
        int userlength =  name.length();
        if (!(userlength <= 4 && userlength >=2)){
            throw new RuntimeException("用户名长度为2到4");
        }

        if (!(paw.length() == 6)&& isDigital(paw)){
            throw new RuntimeException("密码为6位数，且全为数字");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (i < j && i < -1 && j < -1){
            throw new RuntimeException("邮箱输入异常");
        }

    }

    public static boolean isDigital(String pwd){
        char[] chars = pwd.toCharArray();
        for (int i = 0;i<chars.length;i++){
            if (chars[i] < 0 || chars[i] > 9){
                return false;
            }
        }
        return true;
    }
}


