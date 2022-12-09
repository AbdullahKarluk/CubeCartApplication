package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateElement {
    public static void main(String[] args) {
        List<String> fruitList=new ArrayList<>();
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Grape");
        fruitList.add("Peach");
        fruitList.add("Watermelon");
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Grape");



       HashSet<String> set=new HashSet<>();
        for (int i=0;i<fruitList.size();i++){
            String fruits=fruitList.get(i);
            if (set.add(fruits)==false){
                System.out.println(fruits+"is duplicated");

            }
        }
        HashSet<String> set1=new HashSet<>();
        for (int i=0;i<fruitList.size();i++){
            if (set1.add(fruitList.get(i))==false){
                System.out.println(fruitList.get(i)+"is duplicated");

            }
            }
        for (String s:fruitList){
            System.out.print(s+" ");
        }

    }
}
