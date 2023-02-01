//4*. (Необязательная задача повышенной сложности)
//Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
//Разность:
//A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
//B - A = все числа из второй коллекции, которые не содержатся в первой
//Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй,
// которых нет в первой
package Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HW3task4 {
    static Random random = new Random();

    public static void main(String[] args) {
        List<Integer> ArrayList1 = createAndFillArrayList(10, 0, 10);
        List<Integer> ArrayList2 = createAndFillArrayList(10, 0, 10);
        System.out.println("A: " + ArrayList1);
        System.out.println("B: " + ArrayList2);
        System.out.println("A-B: " + differenceCollections(ArrayList1, ArrayList2));
        System.out.println("B-A: " + differenceCollections(ArrayList2, ArrayList1));
        System.out.println("B^A: " + differenceSymmetric(ArrayList1, ArrayList2));

    }

    public static List<Integer> createAndFillArrayList(int size, int min, int max) {//создаем и заполняем список
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            listNumbers.add(random.nextInt(min, max + 1));
        }
        return listNumbers;
    }

    public static List<Integer> differenceCollections(List<Integer> list1, List<Integer> list2) {
        List<Integer> listResult = new ArrayList<>();
        for (int i : list1) {
            if (!list2.contains(i)) {
                listResult.add(i);
            }
        }
        return listResult;
    }

    public static List<Integer> differenceSymmetric(List<Integer> list1, List<Integer> list2) {
        List<Integer> listResult = new ArrayList<>();
        listResult.addAll(differenceCollections(list1, list2));
        listResult.addAll(differenceCollections(list2, list1));
        return listResult;
    }
}
