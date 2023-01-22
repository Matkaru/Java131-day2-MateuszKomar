package Task12;

//Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
//
//        dodawanie aut do listy,
//        usuwanie auta z listy,
//        zwracanie listy wszystkich aut,
//        zwracanie aut z silnikiem V12,
//        zwracanie aut wyprodukowanych przed rokiem 1999,
//        zwracanie najdroższego auta,
//        zwracanie najtańszego auta,
//        zwracanie auta z co najmniej 3 producentami,
//        zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
//        sprawdzanie czy konkretne auto znajduje się na liście,
//        zwracanie listy aut wyprodukowanych przez konkretnego producenta,
//        zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
//        System.out.println(cars);
    }

    public void removedCar(Car car) {
        cars.remove(car);
        System.out.println(cars);
    }

    public List<Car> getAllCars() {
        List<Car> result = new ArrayList<>();
        result.addAll(cars);
        return result;
    }

    public List<Car> getAllV12() {

        return cars.stream()
                .filter(car -> EngineType.V12 == car.getEngineType())
                .collect(Collectors.toList());
    }

    public List<Car> getAllBefore1999() {

        return cars.stream()
                .filter(car -> Year.of(1999).isAfter(car.getYearProduction()))
                .collect(Collectors.toList());
    }

    public Car getMostExpensive() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null || mostExpensiveCar.getPrice().compareTo(car.getPrice()) < 0) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getMostExpensive2() {
        return (Car) cars.stream().sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public Car getCheapest() {
        Car cheapestCar = null;
        for (Car car : cars) {
            if (cheapestCar == null || cheapestCar.getPrice().compareTo(car.getPrice()) > 0) {
                cheapestCar = car;
            }
        }
        return cheapestCar;
    }

    public List<Car> getMultiManufacturerCar() {
        List<Car> result = cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
        return result;
    }

    public List<Car> getSortedList(SortOrder sortOrder) {
        if (SortOrder.DESCENDING == sortOrder) {
            Comparator<Car> reversed = Comparator.comparing((Car car) -> car.getYearProduction()).reversed();
            return cars.stream()
                    .sorted(reversed)
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted(Comparator.comparing(car -> car.getYearProduction()))
                    .collect(Collectors.toList());
        }
    }

    public boolean isOnTheList(Car car) {
        return cars.contains(car);
    }

    public List<Car> getAllProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());

    }
    //     zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.

    private List<Year> yearsOfCreation(Car car) {
        return car.getManufacturers().stream()
                .map(manufacturer -> manufacturer.getYearOfFunded())
                .collect(Collectors.toList());
    }

    public List<Car> producedByManufacturerYear(Year ageOfEstablishment, ComparisonType comparisonType) {
        if (ComparisonType.EQUAL == comparisonType) {
            return cars.stream()
                    .filter(car -> yearsOfCreation(car).contains(ageOfEstablishment))
                    .collect(Collectors.toList());
        } else if (ComparisonType.IS_NOT_EQUAL == comparisonType) {
            return cars.stream()
                    .filter(car -> yearsOfCreation(car).contains(ageOfEstablishment))
                    .collect(Collectors.toList());
        }else if(ComparisonType.HIGHER == comparisonType){
            return cars.stream().filter(car -> yearsOfCreation(car).stream()
                    .anyMatch(year -> year.isAfter(ageOfEstablishment)))
                    .collect(Collectors.toList());
        } else if(ComparisonType.HIGHER_AND_EQUAL == comparisonType){
            return cars.stream().filter(car -> yearsOfCreation(car).stream()
                            .anyMatch(year -> year.isAfter(ageOfEstablishment) || year.equals(ageOfEstablishment)))
                    .collect(Collectors.toList());

        }else if(ComparisonType.LOWER == comparisonType) {
            return cars.stream().filter(car -> yearsOfCreation(car).stream()
                            .anyMatch(year -> year.isBefore(ageOfEstablishment)))
                    .collect(Collectors.toList());
        }else if(ComparisonType.LOWER_AND_EQUALS == comparisonType) {
            return cars.stream().filter(car -> yearsOfCreation(car).stream()
                            .anyMatch(year -> year.isBefore(ageOfEstablishment) || year.equals(ageOfEstablishment)))
                    .collect(Collectors.toList());
        }
        throw new RuntimeException("Comparison type is null");
    }
}