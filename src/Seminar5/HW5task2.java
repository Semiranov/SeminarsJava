//Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//Отсортировать по убыванию популярности.
package Seminar5;

import java.util.*;

public class HW5task2 {
    public static void main(String[] args) {
        List<String> listOfEmployees = new ArrayList<>(Arrays.asList("Андрей", "Вадим", "Андрей", "Иван", "Иван", "Андрей"));
        System.out.println(listOfEmployees);
        printMap(searchForRepetitions(listOfEmployees));
    }

    private static Map<String, Integer> searchForRepetitions(List<String> list) {
        Map<String, Integer> result = new HashMap<>();
        for (String name : list) {
            if (result.containsKey(name)) {
                int count = result.get(name) + 1;
                result.put(name, count);
            } else result.put(name, 1);
        }
        return result;
    }

    private static void printMap(Map<String, Integer> map) {
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
