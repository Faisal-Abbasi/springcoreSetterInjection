package com.springLifeCycle.Xml;

public class House {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                '}';
    }

    /**
     *
     * the name of the init and destroy method can be anything unless or until the signature remains the same
     */
    public void init()
    {
        System.out.println("HeY I am going to initialize the bean");
    }
    public void destroy(){
        System.out.println("Hey I am going to destroy the bean");
    }

}
