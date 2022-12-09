package com.unitedcoder.oopconcept.interfacetutorial;

public interface SimpleCalculator {
    //only accept abstract method
    double  addTwoNumbers(int a,int b);//method name, return type,arguments no implementation
    int addMultipleNumbers(int...numbers);
    double multiplytwoNumbers(double d1, double d2);
    float divideTwoNumbers(double x, double y);
    long suntractTwoNumbers(long l1, long l2);

}
