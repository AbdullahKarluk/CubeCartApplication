package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo3 {
    public static void main(String[] args) {

        int correctPin=5525;
        int balance=500094;
        //Pin number
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        String pin=input.nextLine();
        if (StringUtils.isNumeric(pin)){
            if (Integer.parseInt(pin)==correctPin){
                System.out.println("Please select the menu: Transfer money, deposit money, withdraw money");
                String selectMenu=input.nextLine();
                if (selectMenu.equalsIgnoreCase("withdraw money")){
                    System.out.println("Please select withdraw amount!!");
                    int withDrawAmount=input.nextInt();
                    if (withDrawAmount<=balance){
                        System.out.println("Please take your money! Enjoy!");
                        System.out.printf("Your current balance is %\n",balance-withDrawAmount);
                    }else {
                        System.out.println("Insufficient amount");
                        System.out.println("Withdraw amount is greater than you balance!!!");
                    }

                }else{
                    if (selectMenu.equalsIgnoreCase("deposit money")){
                        System.out.println("Please put your money into the case");
                        int money=input.nextInt();
                        System.out.printf("You have deposited %d amount\n",money);
                        System.out.printf("Your current balance is %d",balance+money);
                    }
                }
            }else {
                System.out.println("You typed wrong pin number, please try again with correct pin number");
            }

        }
        else{
            System.out.println("You entered wrong pin number");
            System.out.println("Please try again with correct pin number");

        }

    }
}
