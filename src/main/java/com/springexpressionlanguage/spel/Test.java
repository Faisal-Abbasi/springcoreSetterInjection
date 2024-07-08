package com.springexpressionlanguage.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {
    @Value("#{24+26}")
    private String x;
    private String y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;

    public Test(String x, String y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Test{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                ", z=" + z +
                '}';
    }

    public Test() {
    }
}
