package framework_collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Figura 16.11: Algorithms1.java
// Métodos Collections reverse, fill, copy, max e min.
public class Algorithms1 {
    public static void main(String[] args) {

        // crie e exibe uma List<Character>
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        // cria CopyList de um array de 3 caracteres
        Character[] lettersCopy = new Character[3];
        List<Character> listCopy = Arrays.asList(lettersCopy);

        // copia o conteúdo da lista para CopyList
        Collections.copy(listCopy, list);
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(listCopy);

        // preenche a lista com Rs
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    private static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for (Character element : listRef) {
            System.out.printf("%s ", element);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf(" Min: %s%n", Collections.min(listRef));
    }
}
