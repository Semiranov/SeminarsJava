//1) Написать метод, который принимает массив элементов,
// помещает их в стэк и выводит содержимое стэка, доставая его содержимое по одному.
//2) Написать метод, который принимает массив элементов, помещает их в очередь и
// выводит на консоль содержимое очереди, доставая её содержимое по одному.

import java.lang.reflect.Array;
import java.util.Stack;

public class task4_2 {
    public static void main(String[] args) {
        fillPrintStack(new int[]{1, 2, 3, 4});

    }

    private static void fillPrintStack(int[] itemNumbers) {
        Stack<Integer> stackNumber = new Stack<>();
        for (int i: itemNumbers) {
            stackNumber.push(i);
        }

        while (!stackNumber.isEmpty()) {
            System.out.println(stackNumber.pop());
        }

    }
}
