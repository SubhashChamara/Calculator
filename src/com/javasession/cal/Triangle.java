package com.javasession.cal;

public class Triangle {

    public Triangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int length;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int height;
    public double area(int length,int height) {
        return length*height/2;

    }
}
