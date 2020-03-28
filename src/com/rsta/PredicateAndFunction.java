package com.rsta;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Testing Predefined Predicate (Implement test abstract method) and Function (Implement apply then and compose)
 * functional intarfaces with lambda expressions
 */
public class PredicateAndFunction {

    public static void main(String[] args) {

        List<Employee> l = new ArrayList<>();
        populate(l);

        Predicate<Double> p = d-> d<1850;
        Function<Employee, Employee> f = e -> {
            e.setSalary(e.getSalary()+ 570);
            return e;
        };

        for(Employee e : l){
            if(p.test(e.getSalary()))
                e = f.apply(e);
            System.out.println(e);
        }



    }

    private static void populate(List<Employee> l){
        l.add(new Employee("rasta",2000));
        l.add(new Employee("Vero",1700));
        l.add(new Employee("Pame",1500));
        l.add(new Employee("Julio",1900));
        l.add(new Employee("Angel",200));

    }
}

class Employee{

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
