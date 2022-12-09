package com.unitedcoder.datastructure;

import java.util.*;

public class CollectionClassMethods {
    public static void main(String[] args) {

        LinkedList<String> names=new LinkedList<>();
        names.add("Selenium");
        names.addFirst("Java");
        names.addLast("Master");
        names.addLast("Tutorial");
        System.out.println(names);
        ListIterator<String> nameList=names.listIterator();
        while (nameList.hasNext()){
            System.out.print(nameList.next()+" ");
        }

    }
}
