package com.wen.map;

import java.util.*;

/**
 * @Author wen
 * @Data 2023/9/3 21:25
 */
public class MapEX2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,new Employee("JON",19000,1));
        map.put(2,new Employee("JO",17000,2));
        map.put(3,new Employee("JON",20000,3));
        map.put(4,new Employee("JON",30000,4));

        Set keySet = map.keySet();
        System.out.println("=====第一种======");
        for (Object key:keySet){
            Object Em = map.get(key);
            Employee employee = (Employee) Em;
            if (employee.getSalary() >  18000){
                System.out.println(employee);
            }
        }

        System.out.println("=====第二种=====");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Object Em = map.get(key);
            Employee employee = (Employee) Em;
            if (employee.getSalary() >  18000){
                System.out.println(employee);
            }
        }

        System.out.println("=====第三种=====");
        Collection em = map.values();
        for (Object Em : em){
            Employee employee = (Employee) Em;
            if (employee.getSalary()>18000){
                System.out.println(employee);
            }
        }

        System.out.println("=====第四种====");
        Set entrySet = map.entrySet();
        for (Object entry:entrySet){
            Map.Entry m = (Map.Entry) entry;
            Employee employee = (Employee) m.getValue();
            if (employee.getSalary() > 18000){
                System.out.println(m.getValue());
            }
        }
    }
}
