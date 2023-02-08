import java.util.*;

public class task6_0 {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(treeSet);
    }
}
