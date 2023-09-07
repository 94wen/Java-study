package com.wen.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wen
 * @Data 2023/5/8 23:23
 */
public class ListEX02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book1("A",12,"chen"));
        list.add(new Book1("B",10,"WEN"));
        list.add(new Book1("C",8,"JON"));
        list.add(new Book1("D",29,"NI"));
        list.add(new Book1("E",36,"chen"));

        sort(list);
        for (Object o:list){
            System.out.println(o);
        }
        
    }

    public static void sort(List list){
        int Listsize = list.size();
        for (int i = 0; i < Listsize-1 ; i++) {
            for (int j = 0; j < Listsize-1-i ; j++) {
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}


class Book1{
    private String name;
    private double price;
    private String author;
    public Book1(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "名称=" + name +'\t'+
                '\t'+ " 价格=" + price +
                '\t'+" 作者=" + author ;
    }
}
