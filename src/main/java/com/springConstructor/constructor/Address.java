package com.springConstructor.constructor;

public class Address {
    private String addresss;

    public Address(String address) {
        this.addresss = address;
    }


    @Override
    public String toString() {
        return "Address{" +
                "address='" + addresss + '\'' +
                '}';
    }
}
