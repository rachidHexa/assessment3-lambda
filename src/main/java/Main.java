import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {



        /*
    Write a java code to find duplicate elements in the above list using java 8 streams.
     */
        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        System.out.println("duplicate elements");
        list.stream().filter(a -> Collections.frequency(list, a)>1).collect(Collectors.toSet()).forEach(System.out::println);
    /*
    Input: List = {4,5,7,8,99,100,101,33,32,4,4}
    Write a java code to remove duplicate elements from the List Using Java 8 without using set.

     */
        List<Integer> lista = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
        System.out.println("remove duplicate elements");
        lista.stream().distinct().forEach(System.out::println);

    /*
    Find the max element from the given list using java 8
    Input: List = {3,90,350,5}
     */
        List<Integer> listb  = Arrays.asList(4,5,7,8,99,100,101,33,32,4,4);
        System.out.println("max element");
        System.out.println(listb.stream().max(Comparator.comparing(a->a)).get());

    /*
    Input :list { 6, 8, 3, 5, 1, 9 };
    Find minimum and maximum elements in an array in Java using streams.

     */
        List<Integer> listc  = Arrays.asList( 6, 8, 3, 5, 1, 9);
        System.out.println("max element");
        System.out.println(listc.stream().max(Comparator.comparing(a->a)).get());

        System.out.println("min element");
        System.out.println(listc.stream().min(Comparator.comparing(a->a)).get());


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employees.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employees.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employees.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employees.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employees.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employees.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employees.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

        Employee employee = new Employee();

        System.out.println("number of employees in each department");
        System.out.println(employee.employeeByDepartment(employees));
        System.out.println("names of all employees in each department");
        System.out.println(employee.namesEmployeeByDepartment(employees));

    }






}
