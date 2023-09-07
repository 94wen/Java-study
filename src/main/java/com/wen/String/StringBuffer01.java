package com.wen.String;

/**
 * @Author wen
 * @Data 2023/4/26 1:01
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        String price = "123456.00";
        StringBuffer sb = new StringBuffer(price);
        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
