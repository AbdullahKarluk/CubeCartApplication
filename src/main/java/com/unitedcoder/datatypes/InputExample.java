package com.unitedcoder.datatypes;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        //define a scanner object
        Scanner ilyas=new Scanner(System.in);
        System.out.println("What is Your Name : ");
        String isim=ilyas.nextLine();
        System.out.println("Your Name is: "+isim);

        System.out.println("5*4 equal ?");
        //Scanner inputValue=new Scanner(System.in);
        int result=ilyas.nextInt();
        System.out.println(String.format("5*4= %d",result));

        //Scanner ageValue=new Scanner(System.in);
        System.out.println("What's Your Age?");
        int age=ilyas.nextInt();
        int year=2022-age;
        System.out.println(String.format("Your name is %s and you are %s years old. You were born in %s.",isim,age,year));

    }
}
