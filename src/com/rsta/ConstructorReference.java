package com.rsta;

import java.util.function.Supplier;

/**
 * Double colon can be used also to construct reference, in the following example
 * it shows how to use it
 * The structure of this kind of reference is Class name :: new
 */
public class ConstructorReference {

    public static void main(String ... args){

        Interf i = Sample::new;
        i.get();

        Runnable r = Sample::new;
        r.run();

    }

}

class Sample {

    Sample() {
        System.out.println("Erase una vez bla bla bla");
    }

}

@FunctionalInterface
interface Interf{
    void get();
}
