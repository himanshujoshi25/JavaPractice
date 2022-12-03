package Stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpClass {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("ABC","1","Delhi",21));
        list.add(new Employee("MNO","2","Noida",40));
        list.add(new Employee("DEF","3","Pune",20));
        list.add(new Employee("GHI","4","Mumbai",30));
        list.add(new Employee("XYZ","10","Delhi",28));

        Map<String, List<Employee>> groupByCity = list.stream()
                .collect(Collectors.groupingBy(x -> x.getCity()));

        System.out.println(groupByCity);

        //Sort based on City
        Map<String, List<Employee>> city = list.stream().collect(Collectors.groupingBy(Employee::getCity));
        city.forEach((key,value) -> {
            System.out.println(key + ":" + value);
        });

        System.out.println("******************************************************************************");

        //Sort using Comparator
        list.sort(Comparator.comparing(Employee::getCity));
        list.forEach(x -> System.out.println(x));

        System.out.println("******************************************************************************");

        //Sort using Comparator in descending order
        list.sort(Comparator.comparing(Employee::getName).reversed());
        list.forEach(x -> System.out.println(x));

        System.out.println("******************************************************************************");

        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getCity)
                .thenComparing(Employee::getName);

        list.sort(employeeComparator);
        list.forEach(x -> System.out.println(x));

        System.out.println("******************************************************************************");

        //Sort based on age
        list.stream().filter(x -> x.getAge() > 25).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

        System.out.println("******************************************************************************");

        list.stream().map(x -> x.getAge() + 5).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

        System.out.println("******************************************************************************");

        list.stream().map(Employee::getName).collect(Collectors.toList())
                .forEach(x -> System.out.println(x));

    }
}
