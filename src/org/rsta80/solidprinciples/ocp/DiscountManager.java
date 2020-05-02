package org.rsta80.solidprinciples.ocp;

/**
 * Example to show the incorrect way to implement new classes
 */
public class DiscountManager {

    /**
     * Wrong implmentation
    *
    Double apply(Double price, Discount discount){
        return discount.apply(price);
    }

    Double apply(Double price, GoldDiscount discount){
        return discount.apply(price);
    }

    Double apply(Double price, BlackFridayDiscount discount){
        return discount.apply(price);
    }

     */

    Double apply(Double price, Discount discount){
        return discount.apply(price);
    }


}
