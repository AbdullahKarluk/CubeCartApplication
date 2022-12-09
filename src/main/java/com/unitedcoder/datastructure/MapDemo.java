package com.unitedcoder.datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> age=new HashMap<>();
        age.put("Alim",35);
        age.put("Aynur",24);
        age.put("Adil",45);
        System.out.println(age.get("Aynur"));



    }
}
