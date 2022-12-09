package com.unitedcoder.datatypes;

public class PrePostIncrementAndDecrement {
    public static void main(String[] args) {
        int a1=30;
        System.out.println(a1);
        int b1=30+(a1++);
        System.out.println(a1);
        int c1=a1++;
        System.out.println(c1);
        System.out.println(b1+a1);
    }
}
