//Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class HW1task1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num = getNum("Введите число N: ");
        int rez = countingNumber(num);
        printRez(rez);
    }


    static int getNum(String text) { //Запрос и ввод числа
        System.out.print(text);
        return input.nextInt();
    }

    static int countingNumber(int num) { //Подсчет числа
        return num * (num + 1) / 2;
    }

    static void printRez(int num) {  //Вывод числа на экран
        System.out.println("Треугольное число = " + num);
    }

}


//1.Спросить ввод числа н
//1.1 Вычислить число
//1.2 Вывести число на экран