import java.io.*;
import java.lang.reflect.Array;

//В файле содержится строка с исходными данными в такой форме:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
//Для разбора строки используйте String.split.
// Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
public class HW2task1 {

    public static void main(String[] args) {

        String str = readFile("src/HW2task1.txt");
        String name = getSt(str, 0);
        String country = getSt(str, 1);
        String city = getSt(str, 2);
        String age = getSt(str, 3);
        System.out.println(getRequest(name, country, city, age));
    }


    public static String readFile(String path) { //Поучение строки из файла
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

    public static String getSt(String str, int a) { //Получение из строки значения
        String st = str.substring(1, str.length() - 1);
        String[] starr = st.split(",");
        String[] st2 = starr[a].split(":");
        return st2[1];
    }

    public static String getRequest(String name, String country, String city, String age) {
        StringBuilder sb = new StringBuilder();
        String exp = "\"null\"";
        int count = 0;
        sb.append("SELECT * FROM students WHERE");
        if (name.equalsIgnoreCase(exp) == false) {
            sb.append(" name = " + name);
            count ++;
        }
        if (country.equalsIgnoreCase(exp) == false) {
            if (count > 0 ) {
                sb.append(" AND");
            }
            sb.append(" country = " + country);
            count++;
        }
        if (city.equalsIgnoreCase(exp) == false) {
            if (count > 0) {
                sb.append(" AND");
            }
            sb.append(" city = " + city);
            count++;
        }
        if (age.equalsIgnoreCase(exp) == false) {
            if (count > 0) {
                sb.append(" AND");
            }
            sb.append(" age = " + age);
        }
        return sb.toString();
    }

}


