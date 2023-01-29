package Seminar2;
//В файле содержится строка с данными:
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//Напишите метод, который разберёт её на составные части и,
// используя StringBuilder создаст массив строк такого вида:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.io.*;

public class HW2task3 {
    public static void main(String[] args) {
        String str = readStringInFile("src/Seminar2/task3.txt");
        System.out.println(str);
        String[] arrStr = getSt(str);
        printArr(getStrArr(arrStr));


    }

    public static String readStringInFile(String path) { //Поучение строки из файла
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
        }
        return sb.toString();
    }

    public static String[] getSt(String str) { //Получение из строки массива строк
        String st = str.substring(2, str.length() - 2); //убрать скобки по краям
        String[] st2 = st.split("}, ");
        return st2;
    }


    public static String[] getStrArr(String[] arrStr) { //кастыльный метод преобразования
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrStr.length; i++) {
            int count = 0;
            sb.append("Студент ");
            for (int j = 0; j < arrStr[i].split(",").length; j++) {
                String st = (arrStr[i].split(",")[j].split(":")[1]);
                count++;
                sb.append(st.substring(1, st.length() - 1));
                if (count == 1) {
                    sb.append(" получил ");
                }
                if (count == 2) {
                    sb.append(" по предмету ");
                }
                if (count == 3) {
                    sb.append(" ; ");
                }
            }
        }
        String[] stArr = sb.toString().split(" ; ");
        return stArr;
    }

    static void printArr(String[] arr) { //Печать массива
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ".");
        }
    }

}
