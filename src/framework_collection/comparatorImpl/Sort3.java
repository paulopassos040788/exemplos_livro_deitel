package framework_collection.comparatorImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Figura 16.9: Sort3.java
// Método sort de Collections com um objeto Comparator personalizado.
public class Sort3 {
    public static void main(String[] args) {
        List<Time2> list = new ArrayList<>();

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 05, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));

        System.out.printf("Unsorted array elements:%n%s%n", list);

        Collections.sort(list, new TimeComparator());

        System.out.printf("Sorted list elements:%n%s%n", list);
    }
}
