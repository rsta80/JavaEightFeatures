package com.rsta;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/**
 * Example how to use double colon (::) used for method reference
 * it can be used directly for static method or by object name
 */
public class MethodReference {

    public static void main(String... args) {

        TestMethodReference1 test = new TestMethodReference1();
        // One example of use is like:
        Runnable r = test::m1;
        Thread t1 = new Thread(r);
        //Same could be
        Thread t2 = new Thread(TestMethodReference1::m2);
        t1.start();
        t2.start();

        DoubleBinaryOperator dbo = TestMethodReference1::m2;


    }
}

class TestMethodReference1 {

    void m1() {

        for (int i = 0; i < 10; i++)
            System.out.println("Testing method reference for Object");

    }

    static void m2() {
        for (int i = 0; i < 10; i++)
            System.out.println("Testing method reference for static method");
    }

    static double m2(Double d1, Double d2) {
        return Integer.parseInt(String.valueOf(d1 * d2));
    }

}
