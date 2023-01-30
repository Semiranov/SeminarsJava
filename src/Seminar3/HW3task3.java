//Задан целочисленный список ArrayList.
//Найти минимальное, максимальное и среднее арифметичское этого списка.
package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW3task3 {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = createAndFillArrayList(5, 0, 10);
        System.out.println(list);
        System.out.println("min = " + findMin(list));
        System.out.println("max = " + findMax(list));
        System.out.println("ср.арифм = " + arithmeticMean(list));

    }

    public static List<Integer> createAndFillArrayList(int size, int min, int max) {//создаем и заполняем список
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            listNumbers.add(random.nextInt(min, max + 1));
        }
        return listNumbers;
    }

    public static int findMin(List<Integer> list) { //поиск минимума
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static int findMax(List<Integer> list) { //поиск максимума
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static float arithmeticMean(List<Integer> list) { //поиск ср.арифм.
        float sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

}
