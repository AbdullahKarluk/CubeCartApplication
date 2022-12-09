package com.unitedcoder.classconcepts;

public class TestCar1 {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car( "Lexus");
        System.out.println(car2.getBrand());
        Car car3=new Car("Honda","Japan","Red",56200);
        System.out.println(car3.getColor());


    }

}
