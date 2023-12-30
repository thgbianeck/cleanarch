package com.bieniek.cleanarch.core.domain;

public class Address {

    private String street;
    private String city;
    private String state;

    public Address() {
    }

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String street() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String city() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String state() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
