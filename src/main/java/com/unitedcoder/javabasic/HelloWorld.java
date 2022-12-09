package com.unitedcoder.javabasic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class HelloWorld {
    public static void main(String[] args) {

        byte b1=101;
        byte b2=001;
        System.out.println(b1&b2);
        String myString="Hello,Selenium";
        System.out.println(myString.length());
       //String myString="Hello,Selenium";
        myString=myString.replace("Hello,","");
        System.out.println(myString.length());
        float number=3414.12f;
        System.out.println(String.format("%.2f",number));
        boolean condition1=true;
        boolean condition2=true;
        boolean condition3=true;
        System.out.println(condition1&condition2&condition3);

        float t,x;
        t=35+5;
        x=t/4;
        System.out.println(x);

        char vChar='b';
        char v2Char=98;
        System.out.println(v2Char);

        String s="nickels" ;

        if(s==("nickels") || s==("pennies") || s==("dimes")){

        System.out.println("Money input error");

            ArrayList<String> names=new ArrayList<>();
            names.add("A");
            System.out.println(names);

            Queue<Integer> numbers=new LinkedList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.remove();
            System.out.println(numbers);

            LinkedList<String> names6=new LinkedList<>();
            names6.add("Selenium");
            names6.addFirst("Java");
            names6.addLast("Master");
            names6.addLast("Tutorial");
            ListIterator<String> nameList=names.listIterator();
            while(nameList.hasNext())
            {
                if(nameList.next()=="Java")
                    System.out.println(nameList.next());
            }

        }



    }


    /*SDASDAS*/
}
