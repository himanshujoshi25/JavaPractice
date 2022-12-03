package EmployeeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rohan", Arrays.asList("123","234")));
        personList.add(new Person("Dipesh", Arrays.asList("456","875")));
        personList.add(new Person("Amit", Arrays.asList("908","560")));

        personList.stream().map(x -> x.getName()).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

        personList.stream().map(x -> x.getPhoneNumbers()).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));


        personList.stream().flatMap(x -> x.getPhoneNumbers().stream()).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

    }
}
