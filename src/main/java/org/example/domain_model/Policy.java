package org.example.domain_model;

import jakarta.validation.constraints.PositiveOrZero;

import java.sql.Date;

public class Policy {
    private String policyId;
    private Date policyStartDate;
    private Date policyEndDate;
    private int policyRate;
    private int numberOfBeneficiaries;
    private PolicyOwner policyOwner;

    public Policy(String policyId, Date policyStartDate, Date policyEndDate, int policyRate, PolicyOwner policyOwner) {
        this.policyId = policyId;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.policyRate = policyRate;
        this.policyOwner = policyOwner;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public int getPolicyRate() {
        return policyRate;
    }

    private void setPolicyRate(int policyRate) {
        this.policyRate = policyRate;
    }

    public int getNumberOfBeneficiaries() {
        return numberOfBeneficiaries;
    }

    public void setNumberOfBeneficiaries(int numberOfBeneficiaries) {
        this.numberOfBeneficiaries = numberOfBeneficiaries;
        if (numberOfBeneficiaries <= 50){
            setPolicyRate(1000000);
        }
        else if (numberOfBeneficiaries <= 100){
            setPolicyRate(850000);
        }
        else if (numberOfBeneficiaries <= 500){
            setPolicyRate(800000);
        }else {
            setPolicyRate(700000);
        }
    }

    public PolicyOwner getPolicyOwner() {
        return policyOwner;
    }

    public void setPolicyOwner(PolicyOwner policyOwner) {
        this.policyOwner = policyOwner;
    }
}
