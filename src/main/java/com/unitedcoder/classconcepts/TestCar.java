package com.unitedcoder.classconcepts;

import java.util.ArrayList;

public class TestCar {
    public static void main(String[] args) {
        Car toyota=new Car();
        toyota.setBrand("Toyota");
        toyota.setMade("Japan");
        toyota.setColor("Red");
        toyota.setMileAge(25000);

        Car benz=new Car();
        benz.setBrand("Benz");
        benz.setMade("Germany");
        benz.setColor("Yellow");
        benz.setMileAge(52084);
        System.out.println(benz.toString());


        System.out.println(benz.getColor());
        System.out.println(toyota.getMade());

        ArrayList<Car> carList=new ArrayList<>();
        carList.add(toyota);
        carList.add(benz);

        for (Car cars:carList){
            System.out.println(String.format("%s %s %s %d",cars.getBrand(),cars.getMade(),cars.getColor(),cars.getMileAge()));

        }

        Math.sqrt(toyota.getMileAge());
    }
}
