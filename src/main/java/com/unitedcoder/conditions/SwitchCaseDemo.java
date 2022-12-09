package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String number=input.next();
        if (StringUtils.isNumeric(number)){
            switch (number.length()){
                case 1:
                    System.out.println("One digit");
                    break;
                case 2:
                    System.out.println("Two digit");
                    break;
                case 3:
                    System.out.println("Three digit");
                    break;
                case 4:
                    System.out.println("Four digit");break;
            }
        }
    }
}
