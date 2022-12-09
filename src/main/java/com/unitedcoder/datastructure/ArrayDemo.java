package com.unitedcoder.datastructure;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numberArray=new int[10];
        String[] stringArray=new String[4];

        numberArray[0] = 1;
        numberArray[1] = 2;
        numberArray[2] = 3;
        numberArray[3] = 4;
        numberArray[9] = 10;
        System.out.println(Arrays.toString(numberArray));
        System.out.println("The number of items in the array numbers: "+numberArray.length);
        for (int number:numberArray){
            System.out.print(number+",");
        }
        System.out.println();
        System.out.println("---- String Array");
        stringArray[0]="ilyas";
        stringArray[1]="ibrahim";
        stringArray[3]="nazira";
        System.out.println("The number of items in the array names: "+stringArray.length);
        for (String stringName:stringArray){
            System.out.print(stringName+", ");
        }

        int[] intArray=new int[]{1,3,0,9,58,985};
        System.out.println("The number of items in the array numbers: "+intArray.length);
        for (int number:intArray){
            System.out.print(number+", ");
        }
        String[] strArray=new String[]{"adil","Perhat","Alim",null};
        System.out.println("The number of items in the array strings: "+strArray.length);
        for (String str:strArray){
            System.out.print(str+", ");
        }
        System.out.println();

        int row=4;
        int column=7;

        String[][] seats=new String[row][column];
        seats[0][2] = "almira";
        seats[0][0]= "Dilnur";
        seats[0][1]= "Aliya";
        seats[1][5]= "Aypari";
        seats[2][6]= "Sheripe";
        for (int r=0;r<row;r++){
            for (int c=0;c<column;c++){
                if (seats[r][c]==null){
                    seats[r][c]="unassigned";
                }
                System.out.println("row " +(r+1)+" column "+(c+1)+" assigned "+seats[r][c]+" ");
            }
        }



    }
}
