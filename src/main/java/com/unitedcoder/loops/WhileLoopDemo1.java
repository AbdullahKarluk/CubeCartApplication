package com.unitedcoder.loops;

import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int positiveNumbersCount=0;
        int negativeNumbersCount=0;

        while (true){
            int number=scanner.nextInt();
            if (number>0){
                positiveNumbersCount++;
            } else if (number<0) {
                negativeNumbersCount++;

            }
            else {
                break;
            }
        }
        System.out.println("Positive Numbers: "+positiveNumbersCount);
        System.out.println("Negative Numbers: "+negativeNumbersCount);

    }
}
