package org.rsta80.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Example how to use streams, filter and map
 * filter use as input parameter a Predicate predefinied functional interface Predicate<T> returning boolean
 * map use as input parameter Function<T,R>
 */

public class StreamsBasic {

    public static void main(String... args) {

        List<Integer> l = Arrays.asList(0, 10, 15, 20, 25, 30);
        List<Integer> l1 = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        l1.forEach(System.out::println);
        l.stream().map(i -> i * 2).forEach(System.out::println);
        l.stream().count();
        List<String> ls = l.stream().map(i -> "El número es: " + i).collect(Collectors.toList());
        System.out.println(ls);
        l.stream().mapToDouble(i -> i * 2).forEach(element -> {
            System.out.println(element);
        });

        System.out.println(l.stream().filter(i -> i > 10).count());


    }

}
