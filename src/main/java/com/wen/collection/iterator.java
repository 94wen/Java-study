package com.wen.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author wen
 * @Data 2023/5/8 16:55
 */
public class iterator {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Book("nihao","A"));
        list.add(new Book("hello","B"));
        list.add(new Book("world","C"));

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("书" + next );
        }
        //退出while循环后，指向数组最后一个，重新输出要重置迭代器
        iterator = list.iterator();
    }
}

class Book{
    private String name;

    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

