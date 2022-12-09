package com.unitedcoder.datastructure;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int [] a=new int[]{20,40,58,4,2,64,8};
        int [] b={25,5,4,6,48,52,14,548};

        System.out.println(a.length);
        System.out.println(a[2]);
        System.out.println(b.length);
        int sum=0;
        for (int i=0;i<b.length;i++){
            sum+=b[i];
            System.out.print(b[i]+" ");
        }
        System.out.println();
        System.out.println(sum);
            int sum1=0;
            for (int r:b){
                sum1+=r;
                System.out.print(r+" ");
            }
        System.out.println();
        System.out.print("Sum of:"+sum1);

    }
}
