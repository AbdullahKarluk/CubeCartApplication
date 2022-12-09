package com.unitedcoder.multithreading;

import com.beust.ah.A;

public class MultiThreadWithAmazonSearch {
    public static void main(String[] args) {
        AmazonSearch amazonSearch1=new AmazonSearch("Apple");
        AmazonSearch amazonSearch2=new AmazonSearch("Ipad");
        AmazonSearch amazonSearch3=new AmazonSearch("Sony WH 1000mx5");
        AmazonSearch amazonSearch4=new AmazonSearch("Logitech mx2");
        AmazonSearch amazonSearch5=new AmazonSearch("Imac");

        Thread thread1=new Thread(amazonSearch1);
        Thread thread2=new Thread(amazonSearch2);
        Thread thread3=new Thread(amazonSearch3);
        Thread thread4=new Thread(amazonSearch4);
        Thread thread5=new Thread(amazonSearch5);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();




    }
}
