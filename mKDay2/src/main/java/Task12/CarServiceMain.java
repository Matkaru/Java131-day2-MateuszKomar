package Task12;

import Task8.Main;

import java.util.ArrayList;
import java.util.List;

public class CarServiceMain {
    public static void main(String[] args) {
        Manufacturer audiManufacturer = new Manufacturer("Audi",1444,"Germany");
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(audiManufacturer);
        CarService carService = new CarService();
        Car car1 = new Car("Audi", "A4",30000,1980,manufacturers,EngineType.V12);
        Car car2 = new Car("Audi", "A6",30000,2006,manufacturers,EngineType.V6);
        Car car3 = new Car("Audi", "A8",30000,2006,manufacturers,EngineType.V6);
        Car car4 = new Car("Audi", "A8",30000,2006,manufacturers,EngineType.V12);
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);

        System.out.println("################################");

        System.out.println(carService.getAllV12());

        System.out.println("###################################");
        System.out.println(carService.getAllBefore1999());


//        List<Car> allCars = carService.getAllCars();
//        allCars.forEach(car -> System.out.println(car));
//        allCars.add(car3);

//        carService.removedCar(car1);
//        carService.removedCar(car2);



    }
}
