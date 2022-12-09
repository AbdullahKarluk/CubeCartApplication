package com.unitedcoder.conditions;

import java.util.Scanner;

public class ConditionalStatementDemo1 {
    public static void main(String[] args) {

        Scanner number=new Scanner(System.in);
        System.out.println("Enter your fist number: ");
        int number1=number.nextInt();
        System.out.println("Enter your second number: ");
        int number2=number.nextInt();

        if (number1>number2){
            System.out.printf("%d is greater than %d",number1,number2);
        }
        else {
            System.out.printf("%d is less than %d",number1,number2);
        }

    }
}
