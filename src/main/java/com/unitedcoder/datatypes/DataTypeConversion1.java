package com.unitedcoder.datatypes;

public class DataTypeConversion1 {
    public static void main(String[] args) {
        int i1=100;
        long l1=i1;
        System.out.println(l1);
        long l4=1000;
        byte b2=(byte)l4;
        System.out.println(b2);

        String s1="25";
        String s2="100$";
        System.out.println(s1+100);

        int i8=Integer.parseInt(s1);
        System.out.println(i8);
    }
}
