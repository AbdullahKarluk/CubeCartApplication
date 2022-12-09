package com.unitedcoder.datatypes;

import java.util.Scanner;

public class JavaStringformat {
    public static void main(String[] args) {
        String str1 = String.format("%d", 101);
        String str2 = String.format("|%20d|", 101);  // Specifying length of integer
        String str3 = String.format("*%-10d*", 101); // Left-justifying within the specified width
        String str4 = String.format("|% d|", 101);
        String str5 = String.format("|%-10d]", 101); // Filling with zeroes
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s %03d\n", s1, x);
        }
        System.out.println("================================");
    }
}
