package com.unitedcoder.datastructure;

import java.util.Scanner;

public class FindMaxValueInArray1 {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter of an array: ");
        int length= scn.nextInt();
        int[] arr=new int[length];
        int maxValue=0;
        for (int i=0;i<arr.length;i++){
            arr[i]=(int) Math.random()*100+1;

        }

    }


}
