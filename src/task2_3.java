import java.io.*;

//Напишите программу которая записывает в файл 100 повторений слова тест
public class task2_3 {
    public static void main(String[] args) {

        String str = getStr("TEST", 10);
        writeFile(str);

    }


    public static void writeFile(String str) {
        try (FileWriter fileWriter = new FileWriter("src/file2_3.txt")) {
            fileWriter.append(str);

        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
        }

    }

    public static String getStr(String str, int kol) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < kol; i++) {
            sb.append(str + " ");
        }
        return sb.toString();

    }
}
