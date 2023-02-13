package Seminar6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Барсик", "Сибирская",
                LocalDate.of(2020, 03, 15), "Людмила");
        cat.addVacctination(new Vaccinations(LocalDate.now(), "Бешенство"));
        cat.addVacctination(new Vaccinations(LocalDate.of(2019, 05, 18), "Комплекс"));
        cats.add(cat);

        cat = new Cat("Мурзик", "Сиамская",
                LocalDate.of(2015, 12, 11), "Михаил");
        cat.addVacctination(new Vaccinations(LocalDate.now(), "Бешенство"));
        cat.addVacctination(new Vaccinations(LocalDate.of(2000, 05, 18), "Комплекс"));
        cats.add(cat);

        for (Cat c :cats) {
            System.out.println(c);

        }
    }
}
