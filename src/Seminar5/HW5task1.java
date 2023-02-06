//Реализуйте структуру телефонной книги с помощью HashMap,
//учитывая, что 1 человек может иметь несколько телефонов.
package Seminar5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HW5task1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> telephoneList = new HashMap<>();
        fillList("Vladimir", new ArrayList<>(Arrays.asList(2323231, 232134, 8453213)), telephoneList);
        fillList("Dmitriy", new ArrayList<>(Arrays.asList(89211232, 891236234, 813213)), telephoneList);
        fillList("Oleg", new ArrayList<>(Arrays.asList(89272156)), telephoneList);
        fillList("Vladimir", new ArrayList<>(Arrays.asList(8987463, 9873662)), telephoneList);
        printHashMap(telephoneList);
    }

    private static void fillList(String name, ArrayList<Integer> tel, Map<String, ArrayList<Integer>> hm) {
        hm.put(name, tel);
    }

    private static void printHashMap(Map<String, ArrayList<Integer>> hm) {
        for (Map.Entry<String, ArrayList<Integer>> pair : hm.entrySet()) {
            System.out.println(pair);
        }

    }

}
