package com.unitedcoder.homework;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class JavaSwitchStatementInClassExercise {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter shorthand: ");
        String notation =input.next();
        if (StringUtils.isNumeric(notation)){
            switch (Integer.parseInt(notation)){
                case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
                    System.out.println("Card Value");
                    break;
                default:
                    System.out.println("Please enter 2-10 number");
            }
        }
        else {
            notation = notation.toUpperCase();
            switch (notation){
                case "A":
                    System.out.println("Ace");
                    break;
                case"J":
                    System.out.println("jack");break;
                case"Q":
                    System.out.println("Queen");break;
                case"K":
                    System.out.println("King");break;
                case"D":
                    System.out.println("Diamonds");break;
                case"H":
                    System.out.println("Heart");break;
                case"S":
                    System.out.println("Spade");break;
                case"C":
                    System.out.println("Clubs");break;
                default:
                    System.out.println("You typed it wrong");

            }

        }
    }
}

