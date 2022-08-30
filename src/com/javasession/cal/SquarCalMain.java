package com.javasession.cal;

public class SquarCalMain {
    public static void main(String[] args) {

        SquareCalculate calc = new SquareCalculate();
        calc.setHight(6);
        calc.setWidth(5);
        System.out.println(calc.squar(calc.getHight(), calc.getWidth()));

    }

}
