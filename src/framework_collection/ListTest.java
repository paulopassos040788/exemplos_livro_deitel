package framework_collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

// Figura 16.3: ListTest.java
// Lists, LinkedLists e ListIterators.
public class ListTest {
    public static void main(String[] args) {

        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        Collections.addAll(list1, colors);

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        Collections.addAll(list2, colors2);

        list1.addAll(list2);
        list2 = null; // libera recursos
        printList(list1);

        convertToUppercaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);

    }

    private static void printList(List<String> list) {
        System.out.printf("%nList:%n");

        for (String color : list) {
            System.out.printf("%s%n", color);
        }
        System.out.println();
    }

    private static void convertToUppercaseStrings(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }

}
