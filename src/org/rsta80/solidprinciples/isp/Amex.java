package org.rsta80.solidprinciples.isp;

import org.rsta80.solidprinciples.isp.interfaces.CreditCardPayment;

public class Amex implements CreditCardPayment {

    @Override
    public void calculatePayment() {

    }

    @Override
    public void creditCardPayment() {

    }

    /*
    @Override
    public void bankTransfer() {

    }

    @Override
    public void cashPayment() {

        // Break the principle: No code

    }*/
}
