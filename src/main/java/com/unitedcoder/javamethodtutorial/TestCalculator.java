package com.unitedcoder.javamethodtutorial;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.addMultipleNumbers(290,24,32,23,12312,351235,3));
        System.out.println(calc.sum(12,24));
        System.out.println(calc.addTwoNumbers("12","24"));
        calc.calculatorInfo();
        StaticMethodAndVariable.setAccountBalance(25336.554);
        StaticMethodAndVariable.cash=2677;
       // StaticMethodAndVariable.account=224;




}}
