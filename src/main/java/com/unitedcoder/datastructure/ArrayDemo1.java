package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayDemo1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        //Add Names

        names.add("almira");
        names.add("Dilnur");
        names.add("Aliya");
        names.add("Sheripe");
        System.out.println("The 3nd name is "+names.get(3));

        //Set .3nd item

        names.set(3,"Arzigul");
        System.out.println("The 3nd name is "+names.get(3));

        // get total size
        System.out.println("Total items: "+names.size());

        for (String name:names){
            System.out.print(name+"  ");
        }
        System.out.println();

        System.out.println(names.toString());

        //Remove fist item and print
        names.remove(0);
        System.out.println(names.toString());

        Integer[] intNumber=new Integer[]{2,5,64,654,33};
        //List<Integer> numberArrayList=new ArrayList<Integer>();
       // numberArrayList= Arrays.asList(intNumber);
        //numberArrayList.remove(0);
//        numberArrayList.set(0,999);
        ArrayList<Integer> numberArrayList=new ArrayList<Integer>();
        Collections.addAll(numberArrayList,intNumber);
        numberArrayList.remove(0);
        numberArrayList.set(2,000);
        for (int number:numberArrayList){

            System.out.print(number+" ");
        }
    }
}
