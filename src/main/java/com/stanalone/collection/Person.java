package com.stanalone.collection;

import org.springframework.core.convert.Property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,String> feeStructure;

    private Properties properties;

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feeStructure=" + feeStructure +
                ", properties=" + properties +
                '}';
    }

    public Map<String, String> getFeeStructure() {
        return feeStructure;
    }

    public void setFeeStructure(Map<String, String> feeStructure) {
        this.feeStructure = feeStructure;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person() {
    }

}
