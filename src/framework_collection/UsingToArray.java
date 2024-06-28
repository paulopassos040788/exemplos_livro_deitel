package framework_collection;

import java.util.Arrays;
import java.util.LinkedList;

// Figura 16.4: UsingToArray.java
// Visualizando arrays como Lists e convertendo Lists em arrays.
public class UsingToArray {

    public static void main(String[] args) {

        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red"); // adiciona como ultimo item
        links.add("pink"); // adiciona no final
        links.add(3, "green"); // adiciona no terceiro indice
        links.addFirst("cyan"); // adiciona como primeiro item

        // obtem elementos linkedList como um array
        colors = links.toArray(new String[0]);

        System.out.println("Colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    }

}
