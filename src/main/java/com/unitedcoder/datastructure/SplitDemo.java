package com.unitedcoder.datastructure;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String school="United_Coder";
        String s="Hello,World";

        String[] array1=school.split("_");
        System.out.println(array1[0]);
        System.out.println(array1[1]);

        for (String a:array1){
            System.out.print(a+" ");

        }
        System.out.println();
        String[] array2=s.split(",");
        System.out.println(Arrays.toString(array2));

        String name="Parhat";
        char[] chr=new char[name.length()];
        for (int i=0;i<name.length();i++){
            chr[i]=name.charAt(i);
            System.out.print(chr[i]+"  ");
        }
        System.out.println();
        System.out.println(Arrays.toString(chr));
    }
}
