package Comparator;

import java.util.Comparator;

public class EmpComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1,Employee o2) {
        return o2.getAge() - o1.getAge();
    }
}
