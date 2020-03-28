package com.rsta;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Uses of count, foreach, min, max and sorted
 * There is many types of sorted, te basic is the natural sorted: sorted(), and there's more complex sort like
 * sorted(Comparator<T,U>) or reverese osrted sorted(-Comparator<T,U>)
 * The count method returns the number of elements of the collection
 * Ant the foreach() method receives as input parameter a consumer<T> function
 */
public class StreamPart2 {

    public static void main(String... args) {

        List<Integer> l = Arrays.asList(51, 151, 545, 15, 18, 18151, 156, 156, 1895, 15113, 15, 1);
        System.out.println(l.stream().sorted().collect(Collectors.toList()));
        //Costumized Comparator
        System.out.println(l.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList()));
        System.out.println(l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
        //Other example
        List<Integer> al = l.stream().sorted((i1, i2) -> i1.compareTo(i2 + 100)).collect(Collectors.toCollection(LinkedList::new));
        System.out.println(al);
        //Reverse
        System.out.println(l.stream().sorted((i1, i2) -> -i2.compareTo(i1)).collect(Collectors.toList()));
        //Count
        System.out.println("Count of elements " + l.stream().filter(i -> i > 1000).count() + " min element: " +
                l.stream().min(Comparator.naturalOrder()) + " and max element: " + l.stream().max(Comparator.naturalOrder()));
        //foreach
        l.stream().forEach(s -> System.out.println(s));

    }
}
