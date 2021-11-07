package Lesson22.Garage;

import java.util.Objects;

public class SpecialCar extends Car {

    private String type;

    public SpecialCar(String brand, String model, int yearProduction, String color, String fuelType,
                      double fuelTankVolume, double mileage, String type) {
        super(brand, model, yearProduction, color, fuelType, fuelTankVolume, mileage);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecialCar)) return false;
        if (!super.equals(o)) return false;
        SpecialCar that = (SpecialCar) o;
        return Objects.equals(getType(), that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getType());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", type='" + type + '\'' +
                "}(SpecialCar)";
    }
}
