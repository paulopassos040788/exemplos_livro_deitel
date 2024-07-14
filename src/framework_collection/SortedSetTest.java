package framework_collection;

import java.util.*;

// Figura 16.17: SortedSetTest.java
// Usando SortedSets e TreeSets.
public class SortedSetTest {
    public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree);

        System.out.print("headSet (\"orange\"): ");
        printSet(tree.headSet("orange"));

        System.out.print("tailSet (\"orange\"): ");
        printSet(tree.tailSet("orange"));

        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());

    }

    private static void  printSet(SortedSet<String> set){

        for(String value : set){
            System.out.printf("%s ", value);
        }

        System.out.println();

    }
}
