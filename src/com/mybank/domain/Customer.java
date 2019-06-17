package com.mybank.domain;

import java.util.ArrayList;

public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<Account> accountsList;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;

        accountsList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(Account acc){
        accountsList.add(acc);
    }

    public Account getAccount(int indexAcc){
        return accountsList.get(indexAcc);
    }

    public int getNumOfAccounts(){
        return accountsList.size();
    }

/*public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        account = acct;
    }*/
    
}
