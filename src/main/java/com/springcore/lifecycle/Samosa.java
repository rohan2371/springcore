package com.springcore.lifecycle;

public class Samosa {
    private double price;
    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("inside setter : ");
        this.price = price;
    }

    public Samosa(){
        super();
    }

    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside the destroy method");
    }
}
