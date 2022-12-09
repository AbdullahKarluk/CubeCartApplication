package com.unitedcoder.datatypes;


import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringUtilsFunction {
    public static void main(String[] args) {
        String s1="Learn Java is fun";
        String s2="Selenium Test Automation";
        System.out.println(StringUtils.reverse(s1));

        Scanner number=new Scanner(System.in);
        int number1=number.nextInt();
        int number2=number.nextInt();

        if (number1>number2){
            System.out.printf("%d is greater than %d",number1,number2);
        }
        else {
            System.out.printf("%d is less than %d",number1,number2);
        }
    }

}
