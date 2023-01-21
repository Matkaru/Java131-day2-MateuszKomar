package Task12;

import java.time.Year;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Ford", 1940,"USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1940,"USA");

        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);

//        manufacturer1.setName("Mercedes");

        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);

        List<Manufacturer>manufacturers1 = List.of(manufacturer1,manufacturer2);
        List<Manufacturer>manufacturers2 = List.of(manufacturer2,manufacturer1);
        Car car1 = new Car("Audi", "A4", 30000,1999,
                List.of(manufacturer1,manufacturer2),EngineType.V8);
        Car car2 = new Car("Audi", "A4", 30000,1999,
                List.of(manufacturer1,manufacturer2),EngineType.V8);

        System.out.println(car1.equals(car2));

}
}