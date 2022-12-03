package EmployeeList;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeList {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(4,"Ramesh",22,"Active","IT",220000));
        list.add(new Employee(10,"Amit",24,"InActive","Finance",320000));
        list.add(new Employee(2,"Dipesh",26,"Active","IT",80000));
        list.add(new Employee(6,"John",22,"InActive","HR",520000));
        list.add(new Employee(1,"Kiran",29,"Active","HR",120000));
        list.add(new Employee(9,"Sita",25,"Active","Finance",890000));
        list.add(new Employee(5,"Bhavesh",30,"InActive","HR",550000));

        //max employee salary in the list
        Optional<Employee> maxEmpSalary = list.stream().collect(Collectors.maxBy
                (Comparator.comparingDouble(Employee::getSalary)));

        System.out.println(maxEmpSalary);

        System.out.println("********************************************************************************");

        //min employee salary in the list
        Optional<Employee> minEmpSalary = list.stream().collect(Collectors.minBy
                (Comparator.comparingDouble(Employee::getSalary)));

        System.out.println(minEmpSalary);

        System.out.println("**********************************************************************************");

        //max salary of an employee from each department
        Map<String, Optional<Employee>> maxEmpSalaryEachDept = list.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.reducing(BinaryOperator.maxBy
                        (Comparator.comparingDouble(Employee::getSalary)))));

        maxEmpSalaryEachDept.forEach( (key,value) -> {
            System.out.println(key  + " : " + value );
        });

        System.out.println("************************************************************************************");

        //Print active and inactive users in the list
        Map<String, Long> empBasedOnStatus = list.stream().collect(Collectors.groupingBy
                (Employee::getStatus, Collectors.counting()));

        empBasedOnStatus.forEach( (key,value) -> {
            System.out.println(key  + " : " + value );
        });

        System.out.println("**********************************************************************************");

        //Print employees details working in each department

        Map<String, List<Employee>> empBasedOnDept = list.stream().collect(
                Collectors.groupingBy(Employee::getDepartment));

        empBasedOnDept.forEach( (key,value) -> {
            System.out.println(key  + " : " + value );
        });

        System.out.println("*************************************************************************************");

        //Print count of employees working in each department

        Map<String, Long> countOfEmpBasedOnDept = list.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        countOfEmpBasedOnDept.forEach( (key,value) -> {
            System.out.println(key  + " : " + value );
        });

    }
}
