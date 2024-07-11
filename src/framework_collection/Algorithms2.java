package framework_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Figura 16.13: Algorithms2.java
// Métodos Collections addAll, frequency e disjoint.
public class Algorithms2 {
    public static void main(String[] args) {

        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> colorsList1 = Arrays.asList(colors);
        ArrayList<String> colorsList2 = new ArrayList<>();

        colorsList2.add("black");
        colorsList2.add("red");
        colorsList2.add("green");

        System.out.println("\nAntes de addAll, list2 contém: ");

        for (String color : colorsList2) {
            System.out.printf("%s ", color);
        }

        Collections.addAll(colorsList2, colors); // adiciona Strings colors à list2

        System.out.println("\nDepois de addAll, list2 contém: ");

        for (String color : colorsList2) {
            System.out.printf("%s ", color);
        }

        // obtém frequência de "red"
        int frequency = Collections.frequency(colorsList2, "red");
        System.out.printf("%nFrequência do vermelho na lista2: %d%n", frequency);

        // verifica se list1 e list2 têm elementos em comum
        boolean disjoint = Collections.disjoint(colorsList1, colorsList2);
        System.out.printf("lista1 e lista2 %s elementos em comum%n", (disjoint ? "não possuem": "têm"));

    }
}
