package org.rsta80.solidprinciples.ocp;

/**
 * Correctly implemented
 */
public class GoldDiscount implements Discount{

    public Double apply(Double price){
        return price * 0.3;
    }
}
