package com.unitedcoder.datatypes;

import java.util.Scanner;

public class TypeConversionDemo {
    public static void main(String[] args) {
        /*int s=250;
        long l1=s;
        float f1=l1;
        System.out.println("Int Value "+"is "+s);
        System.out.println("Long Value "+l1);
        System.out.println("Float Value "+f1);

        double s1=13.59;
        float r=(float)s1;
        System.out.println(r);*/

        int i1=25;
        int i2=7;
        double i3=i1/i2;
        float i4=(float)i1/i2;
        System.out.println(String.format("%d divided by %d equals %f",i1,i2,i3));
        System.out.println(String.format("%d divided by %d equals %.2f",i1,i2,i4));

        String s1="1234";
        int i=1234;
        System.out.println((Integer.valueOf(s1)+i));

       /* String s5="2.52654";
        System.out.println(Double.valueOf(s5));
        System.out.println(Long.valueOf((long) Double.valueOf(s5)));*/
        //System.out.println(Long.valueOf(s5));
        Scanner inputValue=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int d=inputValue.nextInt();
        if (d==0)
            System.out.println("a divisor cannot be 0");
        else{
            int anotherDiv =20/d;
            System.out.println(anotherDiv);

        }
        System.out.println(Math.round(3.9));




    }
}
