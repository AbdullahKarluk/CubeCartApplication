package com.unitedcoder.loops;

import java.util.Random;
import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int winNumber=0;
        System.out.println("Please enter how many times you want to play the game: ");
        int totalGame=input.nextInt();

        for (int i=1;i<=totalGame;i++){
            System.out.println("Enter your lottery number: ");
            int yourNumber=input.nextInt();
            Random randomNumber=new Random();
            int lotteryNumber=randomNumber.nextInt(10);
            System.out.printf("Lottery number of: %d \n Your number of: %d\n",lotteryNumber,yourNumber);
            if (yourNumber==lotteryNumber){
                System.out.println("You won the lottery");
                winNumber++;

            }
            else {
                System.out.println("Plesa try again, you lost");
            }
            System.out.println("Remaining game count: "+(totalGame-i));

        }

    }
}
