package com.unitedcoder.homework;

public class JavaDataTypeCodingProjectHomework {
    public static void main(String[] args) {
        int a1=24, a2=48;
        //The sum of the two numbers;
        System.out.println(String.format("%d+%d=%d", a1,a2,a1+a2));
        //The difference of the two numbers;
        System.out.println(String.format("%d-%d=%d",a2,a1,a2-a1));
        //The product (multiplication) of the two numbers;
        System.out.println(String.format("%d*%d=%d",a1,a2,a1*a2));
        //The average of the two numbers;
        System.out.println(String.format("%d/%d=%d",a2,a1,a2/a1));
        //The absolute values of the two number differences;
        System.out.println(String.format("Absolute value of %d-%d=%d",a1,a2,Math.abs(a1-a2)));
        int a3=Math.abs(a1-a2);
        System.out.println(String.format("Absolute Value of %d-%d=%d",a1,a2,a3));
        //The maximum and minimum of the two numbers;
        System.out.println(String.format("The maximum number of two numbers is: %d",Math.max(a1,a2)));
        System.out.println(String.format("The minimum number of two numbers is: %d",Math.min(a1,a2)));
        //The comparison of the two numbers
        System.out.println(a1>a2);
        System.out.println(a1<a2);

    }
}
