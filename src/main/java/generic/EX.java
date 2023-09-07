package generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author wen
 * @Data 2023/9/7 14:49
 */
public class EX {
    public static void main(String[] args) {
        ArrayList<Employee> employees  =new ArrayList<>();
        employees.add(new Employee("yi",1,new MyDate(1,1,2001)));
        employees.add(new Employee("yi",1,new MyDate(2,2,2001)));
        employees.add(new Employee("yi",1,new MyDate(3,3,2001)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型错误");
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0){
                    return i;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println(employees);
    }
}
