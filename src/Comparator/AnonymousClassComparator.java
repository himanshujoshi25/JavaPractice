package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassComparator {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ram",25,2));
        list.add(new Employee("John",20,9));
        list.add(new Employee("Sam",18,5));
        list.add(new Employee("Amit",30,10));
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
                  return o1.getId() - o2.getId();
            }
        });
        System.out.println(list);

    }
}
