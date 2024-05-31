package org.example.domain_model;

public abstract class Employee extends User{
    public Employee(String id, String fullName, String phoneNumber, Address address, String email, String password) {
        super(id, fullName, phoneNumber, address, email, password);
    }

}
