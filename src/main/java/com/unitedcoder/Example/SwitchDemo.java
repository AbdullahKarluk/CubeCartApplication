package com.unitedcoder.Example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int month = 50;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 9:
                System.out.println("September");
                break;
            default:
                System.out.println("Error");
                break;

        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        char gradeLetter = input.next().charAt(0);
        System.out.println("You entered: " + gradeLetter);
        gradeLetter = Character.toUpperCase(gradeLetter);
        switch (gradeLetter) {
            case 'A':
                System.out.println("Your grade is between 90-100");
                break;
            case 'B':
                System.out.println("Your grade is between 80-90");
                break;
            case 'C':
                System.out.println("Your grade is between 70-80");
                break;
            case 'D':
                System.out.println("Your grade is between 60-70");
                break;
            case 'F':
                System.out.println("Your grade is between 50-60");
                break;
            default:
                System.out.println("Please enter a proper grade :A,B,C,D,F");
                break;
        }

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter from 1 to 12 for months");
        int month1 = input1.nextInt();
        switch (month1) {
            case 1:
                System.out.println("January");
                break;

            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Number");
                System.out.println("Please enter a valid number for months");
                break;


        }
    }
}
