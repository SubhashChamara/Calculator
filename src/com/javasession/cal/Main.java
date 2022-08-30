package com.javasession.cal;

public class Main {
    public static void main(String[] args) {

        Rectangle calc = new Rectangle(10,5);
//        calc.setHight(6);
//        calc.setWidth(5);
        System.out.println(calc.squar(calc.getHight(), calc.getWidth()));

        Round calc1 = new Round(10);
        System.out.println(calc1.area(calc1.getRadius()));

        Triangle calc2 = new Triangle(20,10);
        System.out.println(calc2.area(calc2.getLength(),calc2.getHeight()));

    }

}
