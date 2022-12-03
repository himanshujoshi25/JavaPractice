package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpImpl {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Ram",25,2));
        list.add(new Employee("John",20,9));
        list.add(new Employee("Sam",18,5));
        list.add(new Employee("Amit",30,10));
        Collections.sort(list, new EmpComparator());
        System.out.println(list);

        System.out.println("******************************************************************************");

        List<Employee> list1 = new ArrayList<>(list);
        Collections.sort(list, new NameComparator());
        System.out.println(list);

    }
}
