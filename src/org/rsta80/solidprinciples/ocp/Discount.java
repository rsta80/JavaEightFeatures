package org.rsta80.solidprinciples.ocp;

public interface Discount {
    /*
    public Double apply(Double price) {
        return price * 0.5;
    }*/

    Double apply(Double price);

}
