package Lesson22.Garage;

import java.util.Objects;
abstract class Car {
     private String brand;
     private String model;
     private int yearProduction;
     private String color;
     private String fuelType;
     private double fuelTankVolume;
     private double mileage;

     public Car(String brand, String model, int yearProduction, String color, String fuelType, double fuelTankVolume, double mileage) {
         this.brand = brand;
         this.model = model;
         this.yearProduction = yearProduction;
         this.color = color;
         this.fuelType = fuelType;
         this.fuelTankVolume = fuelTankVolume;
         this.mileage = mileage;
     }

     public String getBrand() {
         return brand;
     }

     public String getModel() {
         return model;
     }

     public int getYearProduction() {
         return yearProduction;
     }

     public String getColor() {
         return color;
     }

     public String getFuelType() {
         return fuelType;
     }

     public double getFuelTankVolume() {
         return fuelTankVolume;
     }

     public double getMileage() {
         return mileage;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYearProduction() == car.getYearProduction() && Double.compare(car.getFuelTankVolume(),
                getFuelTankVolume()) == 0 && Double.compare(car.getMileage(),
                getMileage()) == 0 && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(),
                car.getModel()) && Objects.equals(getColor(), car.getColor()) && Objects.equals(getFuelType(),
                car.getFuelType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getYearProduction(), getColor(), getFuelType(), getFuelTankVolume(),
                getMileage());
    }

    @Override
    public String toString() {
        return "Car{ brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearProduction=" + yearProduction +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", fuelTankVolume=" + fuelTankVolume +
                ", mileage=" + mileage;
    }
}
