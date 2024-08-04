package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(double avgKmPerCharge, int batterySize) {
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName()+"system is initialized");
        return getName()+"engine has started";
    }

    @Override
    public String drive() {
        runEngine(this);
        return  "we are going with"+getName();
    }



    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", cylinders=" + batterySize +
                '}';
    }
}