package com.springConstructor.constructor;

public class Person {
    private String name;
    private int personId;

    private Address Address;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId=" + personId +
                ", Address=" + Address +
                '}';
    }

    public Person(String name, int personId, Address address) {
        this.name = name;
        this.personId = personId;
        Address = address;
    }

    public Person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }

}
