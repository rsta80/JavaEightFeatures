package org.rsta80.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Uses of array method in streams, that returns an array of the list like the following example
 */

public class StreamPart3 {


    public static void main(String... args) {

        //toArray method returns an array of object
        List<String> ls = Arrays.asList("A", "B", "C", "D", "E");
        Object[] sa = ls.stream().toArray();
        for (Object s : sa) {
            System.out.println(s);
        }
        //Same
        Object[] sa1 = ls.stream().toArray(Object[]::new);
        Object[] sa2 = ls.stream().toArray(s -> new String[s]);

        //For group of values
        Stream.of(10.51, 5D, 5.15, 8, 1, "d").forEach(System.out::println);
        List<Double> ld = Stream.of(10.51, 5D, 5.15, 8, 1, 15.2)
                .map(s -> Double.parseDouble(s.toString())).collect(Collectors.toList());

        System.out.println(ld);


    }
}
