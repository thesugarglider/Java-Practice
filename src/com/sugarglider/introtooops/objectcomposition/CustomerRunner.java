package com.sugarglider.introtooops.objectcomposition;

public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("newgolden","mumbai",401);
        Customer customer = new Customer("rahul",homeAddress);


        Address workAddress = new Address("newgoldenwork","mumbai",402);
        customer.setWorkAddress(workAddress);
        System.out.println(customer);
    }
}
