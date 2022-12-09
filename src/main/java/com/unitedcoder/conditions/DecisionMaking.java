package com.unitedcoder.conditions;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
       /* System.out.println("Example 1 for conditional statement");
        Scanner inputAmount=new Scanner(System.in);
        System.out.println("Enter your amount of withdraw: ");
        int withdrawAmount=inputAmount.nextInt();
        System.out.println(String.format("You entered %s",withdrawAmount));
        int balance=5000000;
        *//*if (withdrawAmount<balance){
            balance=balance-withdrawAmount;
            System.out.println("You account current balance: "+balance);
        }
        else {
            System.out.println("Please enter  an amount less than your account balance");
            System.out.println("Your account balance is:"+balance);
            int insufficientAmount=withdrawAmount-balance;
            System.out.println("Your insufficient amount is: "+insufficientAmount);
        }*//*
        int finalBalance=balance-withdrawAmount;
        balance=withdrawAmount<balance ? finalBalance : balance;
        System.out.println("Your balance is "+balance);*/

        Scanner scoreValue = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = scoreValue.nextInt();
        if (score >= 90&&score<=100)
            System.out.println("Your grade is A");
        else if (score >= 80 && score < 90)
            System.out.println("Your grade is B");
        else if (score>70 && score<80) {
            System.out.println("Your grade is C");
        }
        else
            System.out.println("You are failed");

    }
}
