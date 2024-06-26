package framework_collection;

import java.util.*;

// Figura 16.2: CollectionTest.java
// Interface Collection demonstrada por meio de um objeto ArrayList.
public class CollectionTest {

    public static void main(String[] args) {

        // adiciona elementos no array colors a listar
        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};

        List<String> list = new ArrayList<>();

        Collections.addAll(list, colors);

        // adiciona elementos no array removeColors em removeList
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();

        Collections.addAll(removeList, removeColors);

        System.out.println("ArrayList: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for (String color : list){
            System.out.printf("%s ", color);
        }

    }

    // remove cores especificadas em collection2 a partir de collection1
    public static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        // obtém o iterador
        Iterator<String> iterator1 = collection1.iterator();

        while (iterator1.hasNext()) {
            if(collection2.contains(iterator1.next())) {
                iterator1.remove();
            }
        }

    }
}
