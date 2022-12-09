package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(220);
        arrayList.add(420);
        arrayList.add(440);
        arrayList.add(70);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(98);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(1);
        System.out.println(arrayList.get(0));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(arrayList);
        System.out.println(list1);
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println(arrayList.isEmpty());

        Iterator<Integer> iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*************************");

        ListIterator<Integer> it=list1.listIterator(list1.size());
        //it=list1.listIterator();
        while (it.hasPrevious()){
            System.out.println(it.previous()+" ");
        }
    }
}
