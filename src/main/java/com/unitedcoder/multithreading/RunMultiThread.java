package com.unitedcoder.multithreading;

public class RunMultiThread {
    public static void main(String[] args) {
        ThreadClass thread1=new ThreadClass("Men");
        ThreadClass thread2=new ThreadClass("bolsam  ");
        ThreadClass thread3=new ThreadClass("uyghur");
        ThreadClass thread4=new ThreadClass("ogli");
        ThreadClass thread5=new ThreadClass("boliman");


        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        Thread t3=new Thread(thread3);
        Thread t4=new Thread(thread4);
        Thread t5=new Thread(thread5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
