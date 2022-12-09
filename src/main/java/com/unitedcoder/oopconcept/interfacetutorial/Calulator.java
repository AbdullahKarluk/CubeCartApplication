package com.unitedcoder.oopconcept.interfacetutorial;

public class Calulator implements SimpleCalculator {

    @Override
    public double addTwoNumbers(int a, int b) {
        return a+b;
    }

    @Override
    public int addMultipleNumbers(int... numbers) {
        int sum=0;
        for (int n:numbers){
            sum+=n;
        }
        return sum;
    }

    @Override
    public double multiplytwoNumbers(double d1, double d2) {
        return d1*d2;
    }

    @Override
    public float divideTwoNumbers(double x, double y) {
        if (y==0){
            System.out.println("The denominator can not br zero!!");
            return 0;
        }else {
            float division=(float) (x/y);
            return division;

        }
    }

    @Override
    public long suntractTwoNumbers(long l1, long l2) {
        return 0;
    }
}
