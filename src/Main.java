import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//Создайте класс City (code, name, ...).
//Положите в ArrayList.
//Если code нечетное число положите его в TreeSet.
//Выведите их в убывающем порядке.

        Set<City> set = new TreeSet<>();
        ArrayList<City> cities = new ArrayList<>(Arrays.asList(
                new City("Osh", 120000, "Kyrgyzstan", 12),
                new City("Moscow", 1230000, "Russian Federation", 31),
                new City("Bishkek", 457689, "Kyrgyzstan", 68),
                new City("Chyi", 56000000, "Kyrgyzstan", 40)));


        for (City city : cities) {
            if (city.getCode() % 2 == 0) {
                set.add(city);
            }
        }
        for (City city : set) {
            System.out.println(city);

        }

    }
}