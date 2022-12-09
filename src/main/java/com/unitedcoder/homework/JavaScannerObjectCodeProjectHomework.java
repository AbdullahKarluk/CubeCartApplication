package com.unitedcoder.homework;

import java.util.Scanner;

public class JavaScannerObjectCodeProjectHomework {
    public static void main(String[] args) {
        Scanner info=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=info.nextLine();
        System.out.printf("Your name is %s \n",name);

        System.out.println("Whats your house street address?");
        String address=info.nextLine();
        System.out.printf("Your address is : %s \n",address);

        System.out.println("What is the name of the city you are living");
        String city=info.nextLine();
        System.out.printf("My city name is:%s \n",city);

        System.out.println("What is the state?");
        String state=info.nextLine();
        System.out.printf("The state you are living is: %s\n",state);
    }
}
