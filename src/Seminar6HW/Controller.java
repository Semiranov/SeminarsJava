package Seminar6HW;

import java.util.List;
import java.util.Scanner;

public class Controller {
    static Scanner in = new Scanner(System.in);

    public static int searchQuery() { //запрос поиска
        System.out.println("“Введите цифру, соответствующую необходимому критерию:\n" +
                "1 - Фирма\n" +
                "2 - Объем ОЗУ\n" +
                "3 - Объем HDD\n" +
                "4 - OS\n" +
                "5 - Цвет\n");
        return in.nextInt();
    }

    public static String enteringSearch(int num) { //запрос уточнения
        if (num == 1) {
            System.out.println("Введите название фирмы: ");
            return in.next();
        } else if (num == 2) {
            System.out.println("Введите объем ОЗУ ");
            return in.next();
        } else if (num == 3) {
            System.out.println("Введите объем HDD ");
            return in.next();
        } else if (num == 4) {
            System.out.println("Введите ОС ");
            return in.next();
        } else if (num == 5) {
            System.out.println("Введите цвет");
            return in.next();
        } else System.out.println("Error");
        return null;
    }

    public static void laptopSearch(List<Notebook> list, int num, String find) { //поиск ноута
        if (num == 1) {
            for (Notebook n : list) {
                if (n.getManufacturer().equalsIgnoreCase(find)) {
                    System.out.println(n);
                } else System.out.println("-");
            }
        } else if (num == 2) {
            for (Notebook n : list) {
                if (n.getMemory() == Integer.parseInt(find)) {
                    System.out.println(n);
                } else System.out.println("-");
            }

        } else if (num == 3) {
            for (Notebook n : list) {
                if (n.getMemoryHDD() == Integer.parseInt(find)) {
                    System.out.println(n);
                } else System.out.println("-");
            }
        } else if (num == 4) {
            for (Notebook n : list) {
                if (n.getOs().equalsIgnoreCase(find)) {
                    System.out.println(n);
                } else System.out.println("-");
            }
        } else if (num == 5) {
            for (Notebook n : list) {
                if (n.getColor().equalsIgnoreCase(find)) {
                    System.out.println(n);
                } else System.out.println("-");
            }
        }
    }
}
