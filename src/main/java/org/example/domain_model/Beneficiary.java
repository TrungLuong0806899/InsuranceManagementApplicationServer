package org.example.domain_model;

public class Beneficiary extends Customer{
    private PolicyOwner policyOwner;
    public Beneficiary(String id, String fullName, String phoneNumber, Address address, String email, String password, PolicyOwner policyOwner) {
        super(id, fullName, phoneNumber, address, email, password);
        this.policyOwner = policyOwner;
    }

    public PolicyOwner getPolicyOwner() {
        return policyOwner;
    }

    public void setPolicyOwner(PolicyOwner policyOwner) {
        this.policyOwner = policyOwner;
    }
}
