//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.

import java.util.Scanner;

public class task2_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = inputNum("Введите N: ");
        char c1 = inputChar("Введите c1: ");
        char c2 = inputChar("Введите c2: ");
        System.out.println(addStr(n, c1, c2));

    }

    static int inputNum(String text) { //Вывод запроса и ввод значения числа
        System.out.print(text);
        return input.nextInt();
    }

    static char inputChar(String text) { //Вывод запроса и ввод символа
        System.out.print(text);
        String st = input.next();
        return st.charAt(0);
    }

    static String addStr(int n, char a, char b) { //Работа со строкой
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                st.append(a);
            } else {
                st.append(b);
            }
        }
        return st.toString();
    }

}
