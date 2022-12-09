package com.unitedcoder.datastructure;

import java.util.Arrays;

public class ArrayObjectDemo {
    public static void main(String[] args) {
        int[] arr1={5,8,88,45,6};
        int[] arr2={56,1,534,67,9};
        int[] arr3={5,8,88,45,6};
        int[] arr4=Arrays.copyOf(arr2,10);
        Arrays.fill(arr4,5);
        System.out.println(Arrays.toString(arr4));
        arr4[5]=6;
        System.out.println(Arrays.toString(arr4));

        boolean result1= Arrays.equals(arr1,arr2);
        System.out.println(result1);
        boolean result2=Arrays.equals(arr1,arr3);
        System.out.println(result2);

        Arrays.fill(arr3,20);
        System.out.println(arr3[4]);
        System.out.println(Arrays.toString(arr3));
        arr4[9]=85;
        System.out.println(Arrays.toString(arr4));
        arr4[5]=arr3[2];
        System.out.println(Arrays.toString(arr4));

    }
}
