package org.example.domain_model;

public class PolicyHolder extends Beneficiary{
    public PolicyHolder(String id, String fullName, String phoneNumber, Address address, String email, String password, PolicyOwner policyOwner) {
        super(id, fullName, phoneNumber, address, email, password, policyOwner);
    }
}
