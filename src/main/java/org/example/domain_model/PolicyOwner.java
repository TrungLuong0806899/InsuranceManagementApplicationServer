package org.example.domain_model;

public class PolicyOwner extends Customer {
    Policy policy;

    public PolicyOwner(String id, String fullName, String phoneNumber, Address address, String email, String password) {
        super(id, fullName, phoneNumber, address, email, password);
    }
}
