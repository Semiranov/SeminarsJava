package Seminar2;

import java.io.IOException;
import java.util.SimpleTimeZone;
import java.util.logging.*;

//Реализуйте алгоритм сортировки пузырьком числового массива,
//результат после каждой итерации запишите в лог-файл.
public class HW2task2 {


    public static void main(String[] args) throws IOException {


        int[] array = {3, 6, 8, 0, 4, 5, 8, 5, 3, 1,};
        printArr(array);
        sortArr(array);
        System.out.println();
        printArr(array);

    }

    public static void sortArr(int[] arr) throws IOException { //Сортировка пузырьком
        Logger logger = Logger.getLogger(HW2task2.class.getName());
        FileHandler fh = new FileHandler("src/Seminar2/log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        int[] arr2 = new int[arr.length];
        int temp = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    logger.info("Произошла перестановка позиций: " + (i + 1) + "(" + arr[i + 1] + ")" + " и " + i + "(" + arr[i] + ")");
                }
            }
        }


    }

    public static void printArr(int[] arr) { //Печать массивва
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }


}
