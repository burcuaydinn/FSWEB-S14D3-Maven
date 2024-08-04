
package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private  int wheels;

    public Car( int cylinders, String name) {
        this.engine = Boolean.TRUE;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWheels(int wheel) {
        this.wheels = wheels;
    }
    private void printSimpleName() {
        System.out.println("Class name:" + getClass().getSimpleName());
    }
    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }
    public String  accelerate() {
        printSimpleName();
        return "the car is accelerating";
    }
    public String brake() {
        printSimpleName();
        return "the car is braking";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cylinders, name);
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}