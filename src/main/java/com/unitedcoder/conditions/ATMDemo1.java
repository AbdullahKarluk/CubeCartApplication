package com.unitedcoder.conditions;

import java.util.Scanner;

public class ATMDemo1 {
    public static void main(String[] args) {

        int correctpin=5525;
        //Pin number
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        int pin=input.nextInt();
        if (pin==correctpin){
            System.out.println("Your accound number is 21548");
            System.out.println("Your accound balance is 5262$");

        }
        else{
            System.out.println("You entered wrong pin number");
            System.out.println("Please try again with correct pin number");

        }

    }
}
