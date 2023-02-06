//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов

import java.util.HashMap;
import java.util.Map;

public class task5_0 {
    public static void main(String[] args) {
        Map<Integer, String> passportToName = new HashMap<>();
        passportToName.put(123456, "Иванов");
        passportToName.put(321456, "Васильев");
        passportToName.put(234561, "Петрова");
        passportToName.put(234432, "Иванов");
        passportToName.put(123446, "Петрова");
        passportToName.put(654321, "Иванов");
        System.out.println(passportToName);
        for (Map.Entry<Integer, String> pair : passportToName.entrySet()) {
            if (pair.getValue().equalsIgnoreCase("Иванов")) {
                System.out.printf("%d %s\n", pair.getKey(), pair.getValue());
            }
        }
    }
}
