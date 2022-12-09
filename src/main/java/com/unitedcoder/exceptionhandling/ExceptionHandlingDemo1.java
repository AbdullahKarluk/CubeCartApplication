package com.unitedcoder.exceptionhandling;

import com.unitedcoder.inheritancetutorial.DoctorStudent;

import java.io.PrintWriter;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("MMMMM");

        try {


            int[] a = {5, 54, 8, 4, 0};
            System.out.println(a[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Hello World");
        }
        System.out.println("Hello World3");
    }


}
