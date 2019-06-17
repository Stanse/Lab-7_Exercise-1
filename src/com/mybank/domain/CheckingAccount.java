package com.mybank.domain;

public class CheckingAccount extends Account{

    private double overdraftAmount;

    public CheckingAccount(double aInitBalance, double aOverdraft){
        super(aInitBalance);
        overdraftAmount = aOverdraft;
    }

    public CheckingAccount(double aInitBalance){
        this(aInitBalance, 0.0);
    }

    public boolean withdraw(double amt){
        if(balance > amt){
            balance = balance - amt;
            return true;
        } else {
            double overdfraft = amt - balance;
            if(overdfraft < overdraftAmount){
                balance = 0.0;
                overdraftAmount = overdraftAmount - overdfraft;
                return true;
            } else { return  false; }
        }

    }
}
