package org.example.domain_model;

public class Dependant extends Beneficiary{
    private PolicyHolder policyHolder;

    public Dependant(String id, String fullName, String phoneNumber, Address address, String email, String password, PolicyOwner policyOwner, PolicyHolder policyHolder){
        super(id, fullName, phoneNumber, address, email, password, policyOwner);
        this.policyHolder = policyHolder;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }
}
