package com.unitedcoder.datatypes;

public class ReferenceValue {
    public static void main(String[] args) {
        int x=900;
        int y=500;

        int tempValue=x;
        x=y;
        y=tempValue;
        System.out.println(y);
        System.out.println(x);

        int z=500;
        int t=300;

        int value=z;
        z=t;
        t=value;
        System.out.println(t);
        System.out.println(z);
    }
}
