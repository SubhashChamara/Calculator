package com.javasession.cal;

public class Rectangle{

    public Rectangle(int hight, int width) {
        this.hight = hight;
        this.width = width;
    }



//    public SquareCalculate(int hight,int width){
//        this.hight=hight;
//        this.width=width;


    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    private int hight;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;
    public int squar(int hight,int width) {
        return hight * width;


    }

}
