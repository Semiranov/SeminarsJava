//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
package Seminar4;

import java.util.LinkedList;
import java.util.Random;

public class HW4task2 {
    static Random random = new Random();

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = createAndFillList(10, 0, 10);
        System.out.println("Исходный список " + linkedList);

        System.out.println(enqueue(linkedList, 99));//добавляем в конец

        System.out.println("Первый элемент " + dequeue(linkedList));//удаляем первый и возвращаем
        System.out.println(linkedList);

        System.out.println("Первый элемент " + first(linkedList));//возвращаем первый без удаления
        System.out.println(linkedList);

    }

    public static LinkedList<Integer> createAndFillList(int size, int min, int max) {//создаем и заполняем список
        LinkedList<Integer> listNumbers = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            listNumbers.add(random.nextInt(min, max + 1));
        }
        return listNumbers;
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> ll, int num) {//помещаем элемент в конец очереди
        ll.addLast(num);
        return ll;
    }

    public static int dequeue(LinkedList<Integer> ll) {//возвращаем первый и удаляем
        int num = ll.pollFirst();
        return num;
    }

    public static int first(LinkedList<Integer> ll) {//возвращаем первый без удаления
        int num = ll.peekFirst();
        return num;
    }

}
