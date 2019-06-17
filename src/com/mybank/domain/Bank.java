package com.mybank.domain;

import java.util.ArrayList;

public class Bank {
    private static ArrayList<Customer> customers;
    private static int numberOfCustomers;

    static {
        customers = new ArrayList<Customer>();
        numberOfCustomers = 0;
    }
    public Bank() {

    }
    
    public static void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
        numberOfCustomers = customers.size();
    }
    public static int getNumOfCustomers() {
        numberOfCustomers = customers.size();
        return numberOfCustomers;
    }
    public static Customer getCustomer(int customer_index) {
        return customers.get(customer_index);
    }
}
