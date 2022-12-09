package com.unitedcoder.classconcepts;

public class Car {
    //State behavior
    //Class level variable

    private String brand;
    private String made;
    private String color;
    private long mileAge;

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", color='" + color + '\'' +
                ", mileAge=" + mileAge +
                '}';
    }

    public Car() {//Default Constructor

    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String made, String color, long mileAge) {
        this.brand = brand;
        this.made = made;
        this.color = color;
        this.mileAge = mileAge;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileAge() {
        return mileAge;
    }

    public void setMileAge(long mileAge) {
        this.mileAge = mileAge;
    }
}
