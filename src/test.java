import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        measureAddEllements(new ArrayList<Integer>(), "ArrayList", 1_000_000);
        measureAddEllements(new LinkedList<Integer>(), "LinkedList",1_000_000);
    }

    private static void measureAddEllements(List<Integer> list, String hint, int repitCount) {
        long start = System.nanoTime();
        for (int i = 0; i < repitCount; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println(hint);
        System.out.printf("%.1f\n", (end - start) / 1_000_000f);
    }
}

