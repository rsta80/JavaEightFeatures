package com.rsta;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BipredicateAndBifunctionAndBiConsumer {

    public static void main(String... args) {

        BiFunction<String, Double, Student> bf = (n, m) -> new Student(n, m);
        BiPredicate<Student, Student> bp = (s1, s2) -> (s1.getMark() > s2.getMark()) ? true : false;
        BiConsumer<Student, Student> bc = (s1,s2)->{
            if(bp.test(s1,s2))
                System.out.println(s1.getName() + " has greater Mark than " + s2.getName());
            else
                System.out.println(s2.getName() + " has greater Mark than " + s1.getName());
        };

        List<Student> l1 = new ArrayList<>();
        List<Student> l2 = new ArrayList<>();
        populate(l1, bf.apply("Andres", 10D));
        populate(l1, bf.apply("Pame", 7D));
        populate(l2, bf.apply("Vero", 8D));
        populate(l2, bf.apply("Angel", 4D));

        for(Student s1: l1){
            for(Student s2: l2)
                bc.accept(s1,s2);
        }


    }

    private static void populate(List<Student> l, Student s) {
        l.add(s);
    }

}
