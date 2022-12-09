package com.unitedcoder.homework;

public class JavaLoopCodeProjectTwo {
    public static void main(String[] args) {

//        int num=0;
//        for (int i=1;i<500;i++){
//            if (i%3==0){
//                num++;
//
//            }
//        }
//        System.out.println(num);
//
//        int num1=0;
//        for (int i=1;i<500;i++){
//            if (i%5==0){
//                num1++;
//            }
//        }
//        System.out.println(num1);
//
//        int num2=0;
//        for (int i=1;i<500;i++){
//            if (i%15==0){
//                num2++;
//
//            }
//        }
//        System.out.println(num2);
//
//        System.out.println("Numbers that can be divided by 3: ");
//
//        for (int i=1;i<500;i++){
//            if (i%3==0){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//        System.out.println("Numbers that can be divided by 5: ");
//
//        for (int i=1;i<500;i++){
//            if (i%5==0){
//                System.out.print(i+" ");
//            }
//        }
//        System.out.println();
//
//        System.out.println("Numbers that can be divided by 15: ");
//
//        for (int i=1;i<500;i++){
//            if (i%15==0){
//                System.out.print(i+" ");
//            }



        int d3=0;
        int d5=0;
        int d15=0;
        String numbersD3=" ";
        String numbersD5=" ";
        String numbersD15=" ";

        for(int i=1;i<=500;i++){
            if (i%3==0){
                d3++;
                numbersD3=numbersD3+i+" ";
            }
            if (i%5==0){
                d5++;
                numbersD5=numbersD5+i+" ";

            }
            if (i%15==0){
                d15++;
                //numbersD15.add(i);
                numbersD15=numbersD15+i+" ";
            }
        }
        System.out.println(d3);
        System.out.println("Numbers that can be divided by 3 :\n" +numbersD3);
        System.out.println(d5);
        System.out.println("Numbers that can be divided by 5 :\n" +numbersD5);
        System.out.println(d15);
        System.out.println("Numbers that can be divided by 15 :\n" +numbersD15);
    }
}
