package Lesson22.Garage;

import java.util.Objects;

public class Bus extends Car{

   private int passengerCapacity;

   public Bus(String brand, String model, int yearProduction, String color, String fuelType,
              double fuelTankVolume, double mileage, int passengerCapacity) {
      super(brand, model, yearProduction, color, fuelType, fuelTankVolume, mileage);
      this.passengerCapacity = passengerCapacity;
   }

   public int getPassengerCapacity() {
      return passengerCapacity;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Bus)) return false;
      if (!super.equals(o)) return false;
      Bus bus = (Bus) o;
      return getPassengerCapacity() == bus.getPassengerCapacity();
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), getPassengerCapacity());
   }

   @Override
   public String toString() {
      return super.toString() +
              ", passengerCapacity=" + passengerCapacity +
              "}(Bus)";
   }
}
