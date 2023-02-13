package Seminar6;

import java.time.LocalDate;

public class Vaccinations {
    private LocalDate date;
    private String name;


    public Vaccinations(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vaccinations{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }
}
