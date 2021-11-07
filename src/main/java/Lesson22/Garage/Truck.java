package Lesson22.Garage;

import java.util.Objects;

public class Truck extends Car{
    private double liftingCapacity;

    public Truck(String brand, String model, int yearProduction, String color, String fuelType, double fuelTankVolume,
                 double mileage, double liftingCapacity) {
        super(brand, model, yearProduction, color, fuelType, fuelTankVolume, mileage);
        this.liftingCapacity = liftingCapacity;
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return Double.compare(truck.getLiftingCapacity(), getLiftingCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLiftingCapacity());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", liftingCapacity=" + liftingCapacity +
                "}(Truck)";
    }
}
