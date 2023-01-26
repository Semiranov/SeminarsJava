import java.lang.reflect.Array;

//В файле содержится строка с исходными данными в такой форме:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
//SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
//Для разбора строки используйте String.split.
// Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
public class HW2task1 {

    public static void main(String[] args) {
        String str = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String name = getSt(str, 0);
        String country = getSt(str, 1);
        String city = getSt(str, 2);
        String age = getSt(str, 3);
        System.out.println(getRequest(name, country, city, age));
    }


    public static String getSt(String str, int a) { //Получение из строки значения
        String st = str.substring(1, str.length() - 1);
        String[] starr = st.split(",");
        String[] st2 = starr[a].split(":");
        return st2[1];
    }

    public static String getRequest(String name, String country, String city, String age) {
        StringBuilder sb = new StringBuilder();
        String st = "SELECT * FROM students WHERE";
        sb.append(st);
        if (name != "\"null\"") {
            sb.append(" name = " + name);
        }
        if (country != "\"null\"") {
            sb.append(" country = " + country);
        }
        if (city != "\"null\"") {
            sb.append(" city = " + city);
        }
        if (age != "\"null\"") {
            sb.append(" age = " + age);
        }

        return sb.toString();
    }


}


