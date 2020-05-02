package org.rsta80.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * An example chaining consumer predefined functional interface (this implements abstract methods accept and then)
 */
public class PredicateAndFunctionAndComsumer {

    public static void main(String... args) {

        Predicate<Student> p = s -> s.getMark() < 5;
        Function<Student, String> f = s -> {
            if (s.getMark() < 7)
                return "Regulin";
            if (s.getMark() < 8.5)
                return "lo logra";
            else
                return "Que pro!!";
        };

        Consumer<Student> c = s -> {
            System.out.println(s.getName());
            System.out.println(s.getMark());
            System.out.println(f.apply(s));
        };

        List<Student> l = new ArrayList<>();
        populate(l);
        for (Student s : l) {
            if (!p.test(s)) {
                c.accept(s);
            } else {
                System.out.println("Ha reprobado: " + s.getName());
            }
        }

    }

    private static void populate(List<Student> l) {
        l.add(new Student("rast", 7d));
        l.add(new Student("Pame", 9d));
        l.add(new Student("Vero", 8d));
        l.add(new Student("Julio", 3d));
        l.add(new Student("Nuria", 6d));
        l.add(new Student("Stiven", 10d));
    }
}

class Student {
    String name;
    Double mark;

    public Student(String name, Double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(Double mark) {
        this.mark = mark;
    }
}
