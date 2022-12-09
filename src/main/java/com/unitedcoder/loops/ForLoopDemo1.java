package com.unitedcoder.loops;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " - ");
        }
        System.out.println();

        for (int i = 1000; i >= 1; i--)
        {
            System.out.print("ilyas-"+(i)+" ");

        }
        int s=20;
        if (s>10){
            int b=30;
            System.out.println("true");
            System.out.println(b);

        }else{
            System.out.println("false");
        }
        System.out.println(s);

        if (s<40){{
            String b="S40";
            System.out.println(b);
        }}
        for (int j=0;j<=100;){
            if (j!=0&&j%2==0){
                System.out.println(j++);
            }
        }

    }
}
