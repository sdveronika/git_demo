package Lesson22.Garage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Garage {
    private static Map<Car, Integer> cars=new HashMap<>();
    public static void main(String[] args) {

        choice();

    }

    public static Car input(){
        Scanner sc=new Scanner(System.in);
        String choiceClassOfCar="";
        boolean flag= true;
        while(flag){
            System.out.println("Выберите класс автомобиля:\n1. Bus\n2. Truck\n3. Passenger car\n4. Special car");
            choiceClassOfCar= sc.nextLine();
            if(!(choiceClassOfCar.equals("1")) && !(choiceClassOfCar.equals("2")) && !(choiceClassOfCar.equals("3")) && !(choiceClassOfCar.equals("4"))){
                System.out.println("Такого класса автомобиля нет. Попробуйте еще раз.");
            }else{
                flag=false;
            }
        }
        System.out.println("Введите марку автомобиля: ");
        String brand=sc.nextLine();
        System.out.println("Введите модель автомобиля: ");
        String model=sc.nextLine();
        System.out.println("Введите цвет автомобиля: ");
        String color =sc.nextLine();
        System.out.println("Введите тип топлива: ");
        String fuelType=sc.nextLine();
        System.out.println("Введите год выпуска: ");
        int year=sc.nextInt();
        System.out.println("Введите объем топливного бака: ");
        double fuelTankVolume=sc.nextDouble();
        System.out.println("Введите пробег автомобиля: ");
        double mileage=sc.nextInt();
            switch (choiceClassOfCar){
                case "1":
                    System.out.println("Введите пассажировместимость автобуса: ");
                    int passengerCapacity=sc.nextInt();
                    return new Bus(brand,model,year,color,fuelType,fuelTankVolume,mileage,passengerCapacity);
                case "2":
                    System.out.println("Введите грузоподъемность автомобиля: ");
                    double liftingCapacity=sc.nextDouble();
                    return new Truck(brand,model,year,color,fuelType,fuelTankVolume,mileage,liftingCapacity);
                case "3":
                    System.out.println("Введите тип кузова автомобиля: ");
                    String bodyType=sc.next();
                    return new PassengerCar(brand,model,year,color,fuelType,fuelTankVolume,mileage,bodyType);
                case "4":
                    System.out.println("Введите тип спецавтомобиля: ");
                    String type=sc.next();
                    return new SpecialCar(brand,model,year,color,fuelType,fuelTankVolume,mileage,type);
        }
        return null;
    }

    public static String menu(){
        Scanner sc=new Scanner(System.in);
        String choiceMenu;
        System.out.println("Меню:\n1. Парковка автомобиля.\n2. Выезд автомобиля.\n3. Количество запрашиваемых автомобилей.\n4. Отобразить машины, находящиеся в гараже.");
        System.out.println("Введите нужный пункт меню: ");
        choiceMenu=sc.nextLine();
        return choiceMenu;
    }

    public static void choice(){
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        String choiceMenu;
        while (flag){
            choiceMenu=menu();
            switch (choiceMenu) {
                case "1": parking(input());break;
                case "2": leaving(input());break;
                case "3": System.out.println(numberOfCarsInTheGarage(input()));break;
                case "4": System.out.println(cars.toString());
                default:
                    System.out.println("Пункт введен неверно. Попробуйте еще раз.");
                    break;
            }
            System.out.println("Хотите совершить еще действие? (да/нет)");
            String answer = sc.nextLine();
            if(answer.toLowerCase().equals("нет")){
                flag=false;
            }
        }
    }

    public static void parking(Car car){
        if(cars.size()==0){
            cars.put(car, 1);
        }
        else{
        if(cars.containsKey(car)){
            int k=cars.get(car);
            k++;
            cars.put(car,k);
        }
        else{
            cars.put(car, 1);
        }
    }}

    public static void leaving(Car car){
        if(cars.containsKey(car)){
            int k=cars.get(car);
            k--;
            if(k<1){
                cars.remove(car);
            }
            else{
                cars.put(car,k);
            }
        }
        else{
            System.out.println("Машины " +car.toString()+" в гараже нет!");
        }
    }
    public static int numberOfCarsInTheGarage(Car car){
        if(cars.containsKey(car)){
            return cars.get(car);
        }
        else return 0;
    }

}
