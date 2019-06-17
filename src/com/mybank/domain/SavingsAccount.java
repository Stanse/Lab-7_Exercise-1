package com.mybank.domain;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(double aInitBalance, double aInterestRate){
        super(aInitBalance);
        interestRate = aInterestRate;
    }

    public void accumulateInterest(){
        balance = balance + (balance*(interestRate/12));
    }

}
