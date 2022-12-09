package com.unitedcoder.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();

        list1.add(5);list1.add(43);list1.add(21);list1.add(17);list1.add(134);list1.add(4);

        for (int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
        for (int i1:list1){
            System.out.print(i1+" ");
        }
        System.out.println();
        Iterator<Integer> itr=list1.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(list1);

        ListIterator<Integer> it=list2.listIterator(3);
        while (it.hasPrevious()){
            System.out.println(it.previous()+" ");
        }


    }
}
