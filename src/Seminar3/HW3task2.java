//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HW3task2 {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> list = createAndFillArrayList(10, 0, 10);
        System.out.println(chengeList(list));

    }

    public static List<Integer> createAndFillArrayList(int size, int min, int max) {//создаем и заполняем список
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            listNumbers.add(random.nextInt(min, max + 1));
        }
        return listNumbers;
    }

    public static List<Integer> chengeList(List<Integer> sp) {//удаляем четные числа
        for (int i = 0; i < sp.size(); i++) {
            if (sp.get(i) % 2 == 0) {
                sp.remove(i);
                i--;
            }
        }
        return sp;
    }


}
