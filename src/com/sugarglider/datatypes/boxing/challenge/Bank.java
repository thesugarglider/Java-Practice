package com.sugarglider.datatypes.boxing.challenge;

import java.util.ArrayList;

public class Bank {

    private String name;

    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }


    public Customer getCustomer(String customerName){
        for (Customer customer : customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) was not found ", customerName);
        return null;
    }

    public void addCustomer(String customerName, double intialDeposit){
        if(getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, intialDeposit);
            customers.add(customer);
            System.out.println("New Customer Added: " + customerName);
        }
    }
}
