package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName()+"system is initialized");
        return getName()+"engine has started";
    }
    public String drive(){
        System.out.println(getClass().getSimpleName()+"system is on the move");
        runEngine(this);
        return "we are going with"+getName();
    }
    protected void runEngine(CarSkeleton carSkeleton){

        if(carSkeleton instanceof ElectricCar){
            double avgKmPerCharge=((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize=((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("electric running.Per charge: " + avgKmPerCharge +" battery: " + batterySize);
        }else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar=(HybridCar) carSkeleton;
            System.out.println("hybrid running.Per litre: " + hybridCar.getAvgKmPerLiter()+ " cylinders: "+ hybridCar.getCylinders()+" batterysize: "+ hybridCar.getBatterySize());

        } else if (carSkeleton instanceof  GasPoweredCar) {
            GasPoweredCar gasPoweredCar=(GasPoweredCar) carSkeleton;
            System.out.println("hybrid running.Per litre: " + gasPoweredCar.getAverageKmPerLiter()+ " cylinders: "+ gasPoweredCar.getCylinders());

        }else{
            System.out.println("Invalid Car type!");
        }

    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}