package com.unitedcoder.loops;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your balance: ");
        double balance=input.nextDouble();
        System.out.println("Enter your target balance: ");
        double targetBalance= input.nextDouble();

        int years=0;
        int rate=5;

        while (balance<targetBalance){
            years++;
            double interest=balance*rate/100;
            balance=balance+interest;
            System.out.println("year: "+years+"   balance: "+balance);
        }
        System.out.println("Final balance: "+balance);
        System.out.println("Total years: "+years);

        //while loop example2
        System.out.println("Enter initial number :");
        int i1=input.nextInt();
        System.out.println("Enter last number :");
        int i2= input.nextInt();
        int sum=0;
        int i3=i1;
        if (i1<i2){
            while (i3<i2){
                i3++;
                sum=sum + i3;
            }
            System.out.println("Sum of number "+i1+" to "+i2+" is equal :"+sum);
        }else{
            System.out.println("Error!! Last number must be greater than initial number!");
        }
        System.out.println("This is the do while loop**********************");
        int number1=120;
        int number2=0;
        int j;
        do {
            number2++;
            number1=number1/2;
            j=number1;
            System.out.println("J= "+j);
        }
        while (j>1);

        System.out.println("**************For loop****************");
        int sum1=0;
        for (int i7=1;i7<=100;i7++)
        {
            sum1 = sum1 +i7;
            if (sum1>=2000){
                break;
            }
        }
        System.out.println(sum1);

        System.out.println("************Nested for loop**********");
        for (int i=1;i<10;i++)
        {
            for (int s=1;s<=20;s++)
            {
                System.out.print("*");
            }
            System.out.print("  ");
        }

    }
}
