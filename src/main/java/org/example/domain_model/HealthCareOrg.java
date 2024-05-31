package org.example.domain_model;

import java.util.HashMap;
import java.util.Map;

public class HealthCareOrg extends User {
    private Map<String, String> bankInfo = new HashMap<String, String>();
    public HealthCareOrg(String id, String fullName, String phoneNumber, Address address, String email, String password, String bankName, String bankAccountName, String bankAccountNumber) {
        super(id, fullName, phoneNumber, address, email, password);
        this.bankInfo.put("Bank Name", bankName);
        this.bankInfo.put("Bank Account Name", bankAccountName);
        this.bankInfo.put("Bank Account Number", bankAccountNumber);
    }

    public Map<String, String> getBankInfo() {
        return bankInfo;
    }

    public void setBankInfo(Map<String, String> bankInfo) {
        this.bankInfo = bankInfo;
    }
}
