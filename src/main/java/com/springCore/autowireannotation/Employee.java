package com.springCore.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
@Autowired
@Qualifier("address2")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
