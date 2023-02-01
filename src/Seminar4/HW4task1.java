//Пусть дан LinkedList с несколькими элементами.
//Реализуйте метод, который вернет “перевернутый” список.
package Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HW4task1 {
    static Random random = new Random();

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = createAndFillList(10, 0, 10);
        System.out.println(linkedList);
        System.out.println(reverseList(linkedList));

    }

    public static LinkedList<Integer> createAndFillList(int size, int min, int max) {//создаем и заполняем список
        LinkedList<Integer> listNumbers = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            listNumbers.add(random.nextInt(min, max + 1));
        }
        return listNumbers;
    }

    public static LinkedList<Integer> reverseList(List<Integer> list) { //переворачиваем список
        LinkedList<Integer> listResult = new LinkedList<>();
        for (int i = list.size(); i > 0; i--) {
            listResult.add(list.get(i - 1));
        }
        return listResult;


    }
}
