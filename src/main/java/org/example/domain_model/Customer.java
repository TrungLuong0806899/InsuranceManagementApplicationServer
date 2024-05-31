package org.example.domain_model;

public class Customer extends User{
    public Customer(String id, String fullName, String phoneNumber, Address address, String email, String password) {
        super(id, fullName, phoneNumber, address, email, password);
    }

}
