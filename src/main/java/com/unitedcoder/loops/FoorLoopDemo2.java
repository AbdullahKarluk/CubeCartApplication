package com.unitedcoder.loops;

public class FoorLoopDemo2 {
    public static void main(String[] args) {

        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i; //sum=sum+1
            System.out.println("*"+sum);
        }
        System.out.println("Total sum: "+sum);

        int factorial=1;
        for (int i=1;i<=5;i++){
            factorial*=i; //factorial=factorial*i
        }
        System.out.println("factorial: "+factorial);

        int evenNumberCounts=0;
        for (int j=0;j<=100;j++){
            if (j!=0&&j%2==0){
                evenNumberCounts++;
            }
        }
        System.out.println("Total even numbers is: "+evenNumberCounts);

    }
}
