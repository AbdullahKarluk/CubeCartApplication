package com.unitedcoder.homework;

public class PrimitiveDataTypesEX {
    public static void main(String[] args) {
        String schoolName="United coder ", address="Istanbul ", zipcode="34500";
        String schoolFullAddress=(schoolName+address+zipcode);
        System.out.println(schoolName.toUpperCase());
        System.out.println(address.toLowerCase());
        System.out.println(schoolFullAddress.substring(14,19));
        System.out.println(schoolFullAddress.length());
        System.out.println(schoolName.equals("University"));
        System.out.println(schoolName.contains("s"));
        System.out.println(schoolFullAddress);
        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));


        System.out.println(Math.sqrt(16));


    }
}
