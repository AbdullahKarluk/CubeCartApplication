package com.unitedcoder.datatypes;

public class DataTypeDemo1 {
    public static void main(String[] args) {
        //byte data type
        byte b1=100;
        System.out.println(b1);
        b1=125;
        System.out.println("b1 Value after Change:"+b1);

        //Short
        short s1=2500;
        short s2=3000;
        short s3=(short)(s1+s2);
        System.out.println(s3);
        System.out.println(s1);
        int a1=5;
        System.out.println(s1+a1);

        char c3=64;
        System.out.println(c3);
        System.out.println("short min Value"+Short.MIN_VALUE);
        System.out.println("short max Value"+Short.MAX_VALUE);
        double a2=3.6584f;
        System.out.println(a2);
        System.out.println(a1);
        boolean rt1=true;
        System.out.println(rt1);

    }
}
