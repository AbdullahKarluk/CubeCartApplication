package com.unitedcoder.datatypes;

public class StringDemo3 {
    public static void main(String[] args) {
        String result=" All Test Passed ";
        System.out.println(result.length());
        System.out.println(result.trim().length());
        result=result.replace(" ","");
        System.out.println(result.length());
        int ilyas=4;
        int musa=9;
        int amina=4;
        int nazira=3;
        System.out.println(String.format("Sum of children ages:%d+%d+%d+%d=%d",ilyas,musa,amina,nazira,ilyas+nazira+musa+amina));
        //String
        String s1="Java",s2="Test",s3="100",s4="200Plus",s5="500",s6="";
        int i1=200,i2=300;
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2+s3+s4));
        System.out.println(i1+s6+i2);
        System.out.println();

        String message="Customer added Successfully";
        System.out.println(message.toUpperCase().concat(" lower"));

    }
}
