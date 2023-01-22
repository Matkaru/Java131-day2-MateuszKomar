package Task12;

import Task8.Main;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceMain {
    public static void main(String[] args) {
        Manufacturer audiManufacturer = new Manufacturer("Audi",1444,"UK");
        Manufacturer manufacturer2 = new Manufacturer("Audi",1455,"USA");
        Manufacturer manufacturer3 = new Manufacturer("Audi",1520,"Germany");
        Manufacturer manufacturer4 = new Manufacturer("Tatra",1520,"CzechRepublic");


        List<Manufacturer> manufacturers = new ArrayList<>();
        List<Manufacturer> manufacturers1 = new ArrayList<>();

        manufacturers.add(audiManufacturer);
        manufacturers1.add(manufacturer2);
        manufacturers1.add(manufacturer3);
        manufacturers1.add(manufacturer4);
        CarService carService = new CarService();
        Car car1 = new Car("Audi", "A4",30000,1980,manufacturers,EngineType.V12);
        Car car2 = new Car("vw", "A6",50000,2001,manufacturers1,EngineType.V6);
        Car car3 = new Car("Audi", "A8",40000,2002,manufacturers1,EngineType.V6);
        Car car4 = new Car("fiat", "A8",60000,2003,manufacturers,EngineType.V12);
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);

        System.out.println("################################");

        System.out.println(carService.getAllV12());

        System.out.println("###################################");
        System.out.println(carService.getAllBefore1999());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        List<Car> allCars = carService.getAllCars();
//        allCars.forEach(car -> System.out.println(car));
//        allCars.add(car3);

//        carService.removedCar(car1);
//        carService.removedCar(car2);

        System.out.println(carService.getMultiManufacturerCar());

        System.out.println("*************************************");

        carService.getSortedList(SortOrder.DESCENDING).forEach(System.out::println);

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println(carService.isOnTheList(car2));

        carService.getAllProducedBy(manufacturer2).forEach(System.out::println);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        carService.getAllProducedBy(manufacturer4).forEach(System.out::println);


        var carNames= carService.getAllProducedBy(audiManufacturer).stream()
                .map(Car::getName)
                .map(carName -> "Nazwa samochodu " + carName)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(carNames);

        System.out.println("888888888888888888888888888888888888888");


        carService.producedByManufacturerYear(Year.of(1455), ComparisonType.EQUAL);


    }
}
