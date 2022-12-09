package com.unitedcoder.homework;

import java.util.Random;

public class JavaLoopExerciseTwo {
    public static void main(String[] args) {
        Random random=new Random();
        int sum=0;
        for (int i = 0; i < 5; i++) {
            int r=random.nextInt(51);
            System.out.println(r);
            sum+=r;

        }
        System.out.println("Sum= "+sum);
        double average=(double) sum/5;
        System.out.printf("Average = %.2f",average);

    }

}
