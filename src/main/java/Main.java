import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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




    }






}
