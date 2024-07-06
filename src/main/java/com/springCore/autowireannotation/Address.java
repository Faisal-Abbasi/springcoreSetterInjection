package com.springCore.autowireannotation;

public class Address {
    private String city;
    private String street;

    public Address() {
    }

    @Override
    public String
    toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
