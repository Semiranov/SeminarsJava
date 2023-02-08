//1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
//1.5. Создайте метод, в который передайте заполненный выше массив,
//и с помощью Set вычислите процент уникальных значений в данном массиве,
//и верните его в виде числа с плавающей запятой.
//Для вычисления процента используйте формулу:
//процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.*;

public class task6_1 {
    public static void main(String[] args) {

        int[] array = fillingArray(1000, 0, 24);
        System.out.println(Arrays.toString(array));
        Set<Integer> set = fillingSet(array);
        System.out.println(set);
        System.out.println(getUnique(array, set));
    }

    private static int[] fillingArray(int count, int min, int max) {
        int[] arr = new int[count];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max + 1);
        }
        return arr;
    }

    private static Set<Integer> fillingSet(int[] arr) {
        Set<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }
        return set;
    }

    private static float getUnique(int[] arr, Set<Integer> set) {
        return set.size() * 100f / arr.length;

    }

}
