package com.wen.exception;

/**
 * @Author wen
 * @Data 2023/4/15 23:51
 */
public class Execption02 {
    public static void main(String[] args) {
        int age = 80;
        if (!(age>18 && age<120)){
            throw new AgeException("年龄需要在18到20之间");
        }
    }
}
//自定义一个异常
class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}
