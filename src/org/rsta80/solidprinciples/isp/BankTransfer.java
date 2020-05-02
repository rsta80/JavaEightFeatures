package org.rsta80.solidprinciples.isp;

import org.rsta80.solidprinciples.isp.interfaces.BankPayment;

public class BankTransfer implements BankPayment {

    @Override
    public void calculatePayment() {

    }

    /*@Override
    public void creditCardPayment() {

    }

    @Override
    public void bankTransfer() {

    }*/

    @Override
    public void cashPayment() {

        // Break the principle: No code

    }
}
