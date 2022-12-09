package com.unitedcoder.datatypes;

public class JavaOtherOperators {
    public static void main(String[] args) {
        //Assignment operators
       int x1=150;
       x1++;
        System.out.println(x1);
        x1+=5;
        System.out.println(x1);
        x1-=20;
        System.out.println(x1);
        x1*=2;
        System.out.println(x1);
        x1/=2;
        System.out.println(x1);
        x1%=45;
        System.out.println(x1);
        int a1=20;
        int a2=30;
        System.out.println(a1>a2||a1<10);
        int a3=++a1;
        int a4=a1+5;
        int a5=++a1+a3;
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a1);
        int a6=a1++;
        System.out.println(a6);
        System.out.println(a1);

        int ilyas=30;
        int nazira=12;

        System.out.println(ilyas/nazira);
        float division=(float)ilyas/nazira;
        System.out.println(division);
        System.out.println(ilyas%nazira);
     System.out.println("******************");
     int operator=300;
     //System.out.println(Math.random());
     //0-10
     int randomNumbers=(int)(Math.random()*11);
     System.out.println(randomNumbers);

    }
}
