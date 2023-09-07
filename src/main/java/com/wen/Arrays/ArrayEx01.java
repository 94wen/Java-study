package com.wen.Arrays;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author wen
 * @Data 2023/4/27 23:29
 */
public class ArrayEx01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("hongloum",100);
        books[1] = new Book("aaa",90);
        books[2] = new Book("bbb",5);
        books[3] = new Book("ccc",300);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                return book2.price - book1.price;
            }
        });
        System.out.println(Arrays.toString(books));
    }

}

class Book{
    String name;
    int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
