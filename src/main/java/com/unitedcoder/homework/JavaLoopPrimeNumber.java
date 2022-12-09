package com.unitedcoder.homework;

public class JavaLoopPrimeNumber {
    public static void main(String[] args) {

        for (int i = 2; i <= 8; i *= 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("[]");
            }
            System.out.println("");
        }


        int number, count;

        System.out.println(" Prime Numbers from 1 to 30 are : ");
        for(number = 2; number <= 30; number++)
        {
            count = 0;
            for (int i = 2; i < number; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(number + " ");
            }
        }

    }

    }






//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d=scan.nextDouble();
//        String s1=scan.next();
//
//
////        Scanner scan1=new Scanner(System.in);
////        String s=scan1.next();
//
//
//        // Write your code here.
//
//        System.out.println("String: " + s1);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }
//    }
//

