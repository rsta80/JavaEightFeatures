package com.rsta;

import java.util.function.*;

public class PrimitiveFunctionAndConsumerAndSupplier {

    public static void main(String ... args){

        //15 types of primitive function Functional interface
        DoubleFunction<String> df = d -> "number is: " + d;
        ToLongBiFunction<Double,Integer> lbf = (d,i) -> (long) (d * i);
        IntToLongFunction ilf = i -> i*i;

        //Consumer, this example explains how to Consumer will accept two imput methods, Object<T>, and Integer
        ObjIntConsumer<Student> oiconsumer = (s,i) -> System.out.println(s.getName() + " tiene: " + i);
        ObjLongConsumer<Student> olconsumer = (s,l) -> System.out.println(s.getName() + " tiene: " + l);

        //Automatically set the return type if its primitive type (int, long, double) for supplier
        IntSupplier is = () -> 7;
        DoubleSupplier ds = () -> 7D;
        LongSupplier ls = () -> 7L;

        //Unary Operator is function of Functional Interface that returns the input type <T> UnaryOperator(T t)
        UnaryOperator<Double> uod = d -> d;
        UnaryOperator<Integer> uoi = i -> i;
        uod.apply(5D);
        uoi.apply(10);

        //Binary Operator is the same but used in bifunctions
        BinaryOperator<Integer> boi = (i1, i2) -> i1+i2;
        BinaryOperator<Double> bod = (d1, d2) -> d1*d2;
        boi.apply(5,10);
        bod.apply(15D,10D);

        //Te BinaryOperator can return implicit operator in the abstract method, for example
        DoubleBinaryOperator dbo = (d1, d2) -> d1 * d2;
        dbo.applyAsDouble(5D,10D);

    }

}
