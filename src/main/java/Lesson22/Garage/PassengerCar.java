package Lesson22.Garage;

import java.util.Objects;

public class PassengerCar extends Car{

    private String bodyType;

    public PassengerCar(String brand, String model, int yearProduction, String color, String fuelType,
                        double fuelTankVolume, double mileage, String bodyType) {
        super(brand, model, yearProduction, color, fuelType, fuelTankVolume, mileage);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return getBodyType() == that.getBodyType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBodyType());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", bodyType=" + bodyType +
                "}(PassengerCar)";
    }
}
