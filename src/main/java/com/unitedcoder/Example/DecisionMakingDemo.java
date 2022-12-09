package com.unitedcoder.Example;

import java.util.Scanner;

public class DecisionMakingDemo {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = inputNumber.nextInt();
        if (number >= 0) {
            if (number % 2 == 0) {
                System.out.println("You entered an even number");

            } else {
                System.out.println("You entered an odd number");
            }
        } else {
            System.out.println("Please enter a positive number");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score!!");
        int score = input.nextInt();
        if (score <= 100) {
            if (score >= 90 && score <= 100) {
                System.out.println("Your grade is 'A'!!");
            } else if (score >= 80 && score < 90) {
                System.out.println("Your grade is 'B'!!");

            } else if (score >= 70 && score < 80) {
                System.out.println("Your grade is 'C'!!");
            } else {
                System.out.println("You failed the exam, plase work hard");
            }
        }else {
            System.out.println("Wrong number");
        }
    }
}

