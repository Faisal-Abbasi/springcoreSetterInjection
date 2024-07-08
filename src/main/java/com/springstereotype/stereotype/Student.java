package com.springstereotype.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component("student")
@Scope("prototype")
public class Student {

    @Value("Faisal")
    private String name;
    @Value("Lucknow")
    private String city;
    @Value("#{bestFriends}")
    private ArrayList<String> bestFriends;

    public Student(String name, String city, ArrayList<String> bestFriends) {
        this.name = name;
        this.city = city;
        this.bestFriends = bestFriends;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getBestFriends() {
        return bestFriends;
    }

    public void setBestFriends(ArrayList<String> bestFriends) {
        this.bestFriends = bestFriends;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", bestFriends=" + bestFriends +
                '}';
    }
}
