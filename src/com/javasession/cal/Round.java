package com.javasession.cal;

public class Round {

    public Round(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public double area(int radius) {
        return radius*2*22/7 ;

    }

}
