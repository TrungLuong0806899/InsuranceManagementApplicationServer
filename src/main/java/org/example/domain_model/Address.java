package org.example.domain_model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Address {
    private String state;
    private String city;
    private String ward;
    private String address_1;
    private String address_2;

    public Address(String state, String city, String ward, String address_1) {
        this.state = state;
        this.city = city;
        this.ward = ward;
        this.address_1 = address_1;
    }

    public Address(String state, String ward, String city, String address_1, String address_2) {
        this.state = state;
        this.ward = ward;
        this.city = city;
        this.address_1 = address_1;
        this.address_2 = address_2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }
}
