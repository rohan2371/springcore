package com.springcore.ref;

public class A {
    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", b=" + b +
                '}';
    }

    private int x;

    public A() {
        super();
    }

    public A(int x, B b) {
        this.x = x;
        this.b = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    private B b;

}
