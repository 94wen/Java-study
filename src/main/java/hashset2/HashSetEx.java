package hashset2;

import java.util.HashSet;

/**
 * @Author wen
 * @Data 2023/9/1 21:25
 */
public class HashSetEx {
    public static void main(String[] args) {
        HashSet hashset = new HashSet();
        hashset.add(new Employee("jon",12,new Mydate(2001,9,8)));
        hashset.add(new Employee("jon",12,new Mydate(2001,9,8)));
        hashset.add(new Employee("jon",12,new Mydate(2004,9,8)));
        System.out.println(hashset);
    }
}
