package org.example.domain_model;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Claim {
    private String id;
    @FutureOrPresent(
            message = "The date you entered is in the past."
    )
    private Date creationDate;
    @FutureOrPresent(
            message = "The date you entered is in the past."
    )
    private Date claimDate;
    @PositiveOrZero(
            message = "Claim Amount could only assume positive values"
    )
    private int claimAmount;
    private Beneficiary insuredPerson;
    private Policy policy;
    private HealthCareOrg healthCareOrg;
    private Map<String, String> bankInfo = new HashMap<String, String>();


    public Claim(String id, Date creationDate, Beneficiary insuredPerson, Policy policy, HealthCareOrg healthCareOrg, String bankName, String bankAccountName, String bankAccountNumber) {
        this.id = id;
        this.creationDate = creationDate;
        this.insuredPerson = insuredPerson;
        this.policy = policy;
        this.healthCareOrg = healthCareOrg;
        this.bankInfo.put("Bank Name", bankName);
        this.bankInfo.put("Bank Account Name", bankAccountName);
        this.bankInfo.put("Bank Account Number", bankAccountNumber);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public Beneficiary getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(Beneficiary insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public int getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(int claimAmount) {
        this.claimAmount = claimAmount;
    }

    public HealthCareOrg getHealthCareOrg() {
        return healthCareOrg;
    }

    public void setHealthCareOrg(HealthCareOrg healthCareOrg) {
        this.healthCareOrg = healthCareOrg;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public Map<String, String> getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(Map<String, String> bankInfo) {
        this.bankInfo = bankInfo;
    }
}
