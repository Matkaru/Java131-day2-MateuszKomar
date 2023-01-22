package Task12;


import java.time.Year;
import java.util.Objects;

//Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa,
// rok założenia, kraj. Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora.
// Zaimplementuj metody hashCode() i equals() .
//
//Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena,
// rok produkcji, lista producentów (Manufacturer), oraz typ silnika
// (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
// Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
public class Manufacturer {
    private String name;
    private Year yearOfFunded;
    private String country;

    public String getName() {
        return name;
    }

    public Year getYearOfFunded() {
        return yearOfFunded;
    }

    public String getCountry() {
        return country;
    }

    public Manufacturer(String name, int yearOfFunded, String country) {
        this.name = name;
        this.yearOfFunded = Year.of(yearOfFunded);
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfFunded, that.yearOfFunded) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfFunded, country);
    }

    public void setName(String name) {
        this.name = name;
    }
}
