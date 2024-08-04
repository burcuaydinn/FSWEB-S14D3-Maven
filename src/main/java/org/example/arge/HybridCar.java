package org.example.arge;

public class HybridCar extends  CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(String name, String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public HybridCar(double avgKmPerLiter, int cylinders, int batterySize) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
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
        return "HybridCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                ", batterySize=" + batterySize +
                '}';
    }
}