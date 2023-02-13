package Seminar6HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Apple", 512, 512,
                "MacOS", "silver");
        Notebook notebook2 = new Notebook("Asus", 1024, 256,
                "Windows", "black");
        Notebook notebook3 = new Notebook("Acer", 256, 1024,
                "Windows", "white");
        Notebook notebook4 = new Notebook("HP", 128, 128,
                "Linux", "black");
        Notebook notebook5 = new Notebook("MCI", 512, 1024,
                "Windows", "silver");

        List<Notebook> notebooks = new ArrayList<>();

        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);

        int a = Controller.searchQuery();
        String find = Controller.enteringSearch(a);
        Controller.laptopSearch(notebooks, a, find);

    }


}
