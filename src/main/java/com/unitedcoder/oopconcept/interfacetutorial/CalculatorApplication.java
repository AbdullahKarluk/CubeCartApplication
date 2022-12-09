package com.unitedcoder.oopconcept.interfacetutorial;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calulator calculator=new Calulator();
        System.out.println(calculator.addTwoNumbers(9,2));
        System.out.println(calculator.addMultipleNumbers(342,235,5,235,2352,343));
    }
}
