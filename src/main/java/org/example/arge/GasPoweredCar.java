package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double  avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public GasPoweredCar(double avgKmPerLiter, int cylinders) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
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
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                '}';
    }
}