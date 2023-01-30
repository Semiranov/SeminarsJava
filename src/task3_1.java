import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Заполнить список 10ю случайными числами
//Отсортировать методом сорт
public class task3_1 {
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(raandomLists(10));

    }


    public static List raandomLists(int count){
        List<Integer> randonNunbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            randonNunbers.add(random.nextInt(100));
        }
        randonNunbers.sort(null);
        return randonNunbers;

    }



}
